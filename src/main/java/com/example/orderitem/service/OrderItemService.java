package com.example.orderitem.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderitem.dao.OrderItemDao;
import com.example.orderitem.util.Utility;
import com.example.orderitem.vo.OrderItemVo;

@Service
public class OrderItemService {

	@Autowired
	private OrderItemDao dao;
	
	@Autowired
	private Utility utility;
	
	public List<OrderItemVo> getOrderById(Long orderId) {
		return dao.findByOrderId(orderId).stream().map(utility::toToVo).collect(Collectors.toList());
	}

	public String saveOrder(List<OrderItemVo> orderItems) {
		orderItems.stream().map(orderItem ->utility.toToDto(orderItem)).forEach(dao::save);
		return "Order Saved Successfully";
	}

	public String deleteOrder(Long orderId) {
		dao.deleteByOrderId(orderId);
		return "Order Deleted SuccessFully";
	}

	
}
