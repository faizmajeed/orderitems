package com.example.orderitem.vo;

import java.util.Date;
import java.util.List;

public class OrderVo {

	private Long orderId;

	private String customerName;

	private Date orderDate;

	private String shippingAddress;

	private List<OrderItemVo> orderItems;

	private double total;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public List<OrderItemVo> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItemVo> orderItems) {
		this.orderItems = orderItems;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
}
