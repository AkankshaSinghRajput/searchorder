package com.ibm.searchorder;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService { // Spring Beans
	@Autowired
	OrderRepository orderRepository;

	public List<Order> getOrders() {
		return orderRepository.findAll();
	}
}