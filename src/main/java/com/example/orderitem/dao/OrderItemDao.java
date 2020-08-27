package com.example.orderitem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.orderitem.entity.OrderItemEntity;
import com.example.orderitem.entity.OrderItemKey;

public interface OrderItemDao extends CrudRepository<OrderItemEntity, OrderItemKey>{

	@Query("from OrderItemEntity oie where oie.id.orderId=:orderID")
	List<OrderItemEntity> findByOrderId(@Param("orderID")Long orderId);

	@Modifying
	@Query("delete from OrderItemEntity oie where oie.id.orderId = :orderID")
	void deleteByOrderId(@Param("orderID")Long orderId);

}
