package com.example.orderitem.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Order_Item")
public class OrderItemEntity {

	@EmbeddedId
	private OrderItemKey orderItemKey;
	private String productName;
	private Long quantity;
	
	
	public OrderItemKey getOrderItemKey() {
		return orderItemKey;
	}
	public void setOrderItemKey(OrderItemKey orderItemKey) {
		this.orderItemKey = orderItemKey;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "OrderItemEntity [orderItemKey=" + orderItemKey.toString() + ", productName=" + productName + ", quantity="
				+ quantity + "]";
	}
	
	
}
