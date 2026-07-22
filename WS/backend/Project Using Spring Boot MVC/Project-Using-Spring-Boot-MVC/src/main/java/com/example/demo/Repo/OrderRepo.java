package com.example.demo.Repo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Model.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {
		
	Optional<Order>findByOrderId(String orderId);
}
