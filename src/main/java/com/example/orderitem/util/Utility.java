package com.example.orderitem.util;

import org.springframework.stereotype.Component;

import com.example.orderitem.entity.OrderItemEntity;
import com.example.orderitem.entity.OrderItemKey;
import com.example.orderitem.vo.OrderItemVo;

@Component
public class Utility {
	
	public OrderItemVo toToVo(OrderItemEntity entity) {
		OrderItemVo orderVo = new OrderItemVo();
		orderVo.setOrderId(entity.getOrderItemKey().getOrderId());
		orderVo.setProductCode(entity.getOrderItemKey().getProductCode());
		orderVo.setProductName(entity.getProductName());
		orderVo.setQuantity(entity.getQuantity());
		return orderVo;
	}
	
	public OrderItemEntity toToDto(OrderItemVo orderVo) {
		OrderItemEntity orderEntity = new OrderItemEntity();
		OrderItemKey key = new OrderItemKey();
		key.setOrderId(orderVo.getOrderId());
		key.setProductCode(orderVo.getProductCode());
		orderEntity.setOrderItemKey(key);
		orderEntity.setProductName(orderVo.getProductName());
		orderEntity.setQuantity(orderVo.getQuantity());
		return orderEntity;
	}
}
