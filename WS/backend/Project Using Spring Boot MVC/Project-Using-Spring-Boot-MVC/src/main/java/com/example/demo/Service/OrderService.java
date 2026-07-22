package com.example.demo.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Model.Order;
import com.example.demo.Model.OrderItem;
import com.example.demo.Model.Product;
import com.example.demo.Model.DTO.OrderItemRequest;
import com.example.demo.Model.DTO.OrderItemResponse;
import com.example.demo.Model.DTO.OrderRequest;
import com.example.demo.Model.DTO.OrderResponse;
import com.example.demo.Repo.OrderRepo;
import com.example.demo.Repo.ProductRepo;

@Service
public class OrderService {
	
	@Autowired
	private ProductRepo productRepo;
	@Autowired
	private OrderRepo orderRepo;

	public OrderResponse placeOrder(OrderRequest request) {
		Order order = new Order();
		String orderId = "ORD"+ UUID.randomUUID().toString().substring(0,8).toUpperCase();
		order.setOrderId(orderId);
		order. setCustomerName(request.CustomerName());
		order.setEmail(request.email());
		order.setStatus("PLACED");
		order.setOrderDate(LocalDate.now());
		
		List<OrderItem> orderItems = new ArrayList<>();
		for(OrderItemRequest itemReq : request.items()) {
			
			Product product = productRepo.findById(itemReq.productId())
					.orElseThrow(() -> new RuntimeException("PRODUCT NOT FOUND"));
			
			product.setStockQuantity(product.getStockQuantity()-itemReq.quantity());
			productRepo.save(product);
			
			OrderItem orderItem = new OrderItem();
			orderItem.setProduct(product);
			orderItem.setQuantity(itemReq.quantity());
			orderItem.setTotalPrice(product.getPrice().multiply(BigDecimal.valueOf(itemReq.quantity())));
			orderItem.setOrder(order);
			orderItems.add(orderItem);		
		}
		
		order.setOrderItems(orderItems);
		Order savedOrder = orderRepo.save(order);
		
		
			List<OrderItemResponse> itemResponses = new ArrayList<>();
			for(OrderItem item : order.getOrderItems()) {
				OrderItemResponse orderItemResponse = new OrderItemResponse(
					item.getProduct().getName(),
					item.getQuantity(),
					item.getTotalPrice()	
						
						);
				itemResponses.add(orderItemResponse);
				
			}
		
		OrderResponse  orderResponse = new OrderResponse(
				savedOrder.getOrderId(),
				savedOrder.getCustomerName(),
				savedOrder.getEmail(),
				savedOrder.getStatus(),
				savedOrder.getOrderDate(),
				itemResponses
				
				
				);
		return orderResponse;
	}
	
	

	public List<OrderResponse> getAllOrderResponses() {
		List<Order>  order = orderRepo.findAll();
		List<OrderResponse> orderResponses = new ArrayList<>();
		
		for(Order order : orders) {
			List<OrderItemResponse> itemResponses = new ArrayList<>();
			for(OrderItem item : order.getOrderItems()) {
				OrderItemResponse orderItemResponse = new OrderItemResponse(
						item.getProduct().getName(),
						item.getQuantity(),
						item.getTotalPrice()					
						);
				
				itemResponses.add(orderItemResponse);
			}
			
			OrderResponse  orderResponse = new OrderResponse(
					order.getOrderId(),
					order.getCustomerName(),
					order.getEmail(),
					order.getStatus(),
					order.getOrderDate(),
					itemResponses
					
					);
			orderResponses.add(orderResponse);
			
		}
		return orderResponses;
	}
		
}
