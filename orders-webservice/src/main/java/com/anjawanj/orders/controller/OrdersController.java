package com.anjawanj.orders.controller;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anjawanj.orders.model.Order;
import com.anjawanj.orders.repositories.OrdersRepository;



@RestController
@RequestMapping(value = "/order/api/v1/orders")
public class OrdersController {

	@Autowired
	OrdersRepository ordersRepository;
	
	
	@RequestMapping("/{orderNumber}")
	public Optional<Order> byNumber(@PathVariable("orderNumber") Integer orderNumber) {

		
			Optional<Order> order = ordersRepository.findById(orderNumber);
			return order;
		
	}
}