package com.example.demo.Model.DTO;

import java.util.List;

public record OrderRequest(
		String CustomerName, 
		String email,
		List<OrderItemRequest> items
		){}
