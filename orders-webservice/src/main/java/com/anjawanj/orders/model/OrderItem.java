package com.anjawanj.orders.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="ORDER_ITEM")
public class OrderItem {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ORDER_ITEM_ID")
	private Integer orderItemID;
	
	@Column(name="PRODUCT_ID")
	@NotNull
	private Integer productID;
	
	@Enumerated(EnumType.STRING)
	@NotNull
	@Column(name="ORDER_ITEM_STATUS_CODE")
	private OrderItemStatusCode orderItemStatusCode;
	
	@Column(name="DATE_ORDER_PLACED")
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")	
	private Date dateOrderPlaced;
	
	@Column(name="ORDER_ITEM_QUANTITY")
	@NotNull
	private Integer orderItemQuantity;
	
	@Column(name="ORDER_ITEM_PRICE")
	@NotNull
	private Double orderItemPrice;
	
	public Integer getProductID() {
		return productID;
	}
	public void setProductID(Integer productID) {
		this.productID = productID;
	}
	public OrderItemStatusCode getOrderItemStatusCode() {
		return orderItemStatusCode;
	}
	public void setOrderItemStatusCode(OrderItemStatusCode orderItemStatusCode) {
		this.orderItemStatusCode = orderItemStatusCode;
	}
	public Date getDateorderPlaced() {
		return dateOrderPlaced;
	}
	public void setDateorderPlaced(Date dateOrderPlaced) {
		this.dateOrderPlaced = dateOrderPlaced;
	}
	public Integer getOrderItemQuantity() {
		return orderItemQuantity;
	}
	public void setOrderItemQuantity(Integer orderItemQuantity) {
		this.orderItemQuantity = orderItemQuantity;
	}
	public Double getOrderItemPrice() {
		return orderItemPrice;
	}
	public void setOrderItemPrice(Double orderItemPrice) {
		this.orderItemPrice = orderItemPrice;
	}
	
	
	
	public OrderItem() {
	
	}
	public OrderItem(Integer productID, OrderItemStatusCode orderItemStatusCode, Date dateOrderPlaced,
			Integer orderItemQuantity, Double orderItemPrice) {	
		this.productID = productID;
		this.orderItemStatusCode = orderItemStatusCode;
		this.dateOrderPlaced = dateOrderPlaced;
		this.orderItemQuantity = orderItemQuantity;
		this.orderItemPrice = orderItemPrice;
	}
	
	

}
