package com.example.orderitem.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class OrderItemKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long productCode;
	
	private Long orderId;

	public Long getProductCode() {
		return productCode;
	}

	public void setProductCode(Long productCode) {
		this.productCode = productCode;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		return "OrderItemKey [productCode=" + productCode + ", orderId=" + orderId + "]";
	}
	
}
