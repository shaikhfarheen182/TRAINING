package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.DTO.OrderRequest;
import com.example.demo.Model.DTO.OrderResponse;
import com.example.demo.Service.OrderService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class OrderController {
	@Autowired	
	private OrderService orderService;
	
	
	@PostMapping("/place")
	public ResponseEntity<OrderResponse> placeOrder(@RequestBody OrderRequest orderRequest){
		OrderResponse orderResponse = orderService.placeOrder(orderRequest);
		return new ResponseEntity<> (orderResponse,HttpStatus.CREATED);
	}
	
	
	public ResponseEntity<List<OrderResponse>> getAllOrders(){
		List<OrderResponse> responses =  orderService.getAllOrderResponses();
		return new ResponseEntity<> (responses,HttpStatus.OK);
	}
}
