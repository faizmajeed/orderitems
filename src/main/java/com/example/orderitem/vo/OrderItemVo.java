package com.example.orderitem.vo;

public class OrderItemVo {
	private Long orderId;
	private Long productCode;
	private String productName;
	private Long quantity;
	
	public Long getProductCode() {
		return productCode;
	}
	public void setProductCode(Long productCode) {
		this.productCode = productCode;
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
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	@Override
	public String toString() {
		return "OrderItemVo [orderId=" + orderId + ", productCode=" + productCode + ", productName=" + productName
				+ ", quantity=" + quantity + "]";
	}
	
}
