package com.anjawanj;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.anjawanj.orders.model.Order;
import com.anjawanj.orders.model.OrderItem;
import com.anjawanj.orders.model.OrderItemStatusCode;
import com.anjawanj.orders.repositories.OrdersRepository;



@EnableEurekaClient
@SpringBootApplication
public class OrdersApplication /*implements CommandLineRunner*/{
	
	
	public static void main(String[] args) {
		SpringApplication.run(OrdersApplication.class, args);
	}
	
	/*@Override
	public void run(String... strings) throws Exception {
		
		OrderItem orderItem1 = new OrderItem(111,OrderItemStatusCode.ACTIVE, java.sql.Date.valueOf("2017-11-15"), 10, 211.23);
		OrderItem orderItem2 = new OrderItem(222,OrderItemStatusCode.DELETED, java.sql.Date.valueOf("2018-01-22"), 10, 211.23);
		OrderItem orderItem3 = new OrderItem(333,OrderItemStatusCode.PENDING, java.sql.Date.valueOf("2018-07-30"), 10, 211.23);
		OrderItem orderItem4 = new OrderItem(444,OrderItemStatusCode.INACTIVE, java.sql.Date.valueOf("2018-12-27"), 10, 211.23);
		
		List<OrderItem> orderItems = new ArrayList<>();
		orderItems.add(orderItem1);
		orderItems.add(orderItem2);
		orderItems.add(orderItem3);
		orderItems.add(orderItem4);
		
		Order order = new Order("ramgawande@gmail.com", orderItems);
		
		ordersRepository.save(order);
		
	}*/
}