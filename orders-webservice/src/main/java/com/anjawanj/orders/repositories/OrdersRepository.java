package com.anjawanj.orders.repositories;

import java.math.BigInteger;


import org.springframework.data.repository.CrudRepository;


import com.anjawanj.orders.model.Order;
 
public interface OrdersRepository extends CrudRepository<Order, Integer> {

}