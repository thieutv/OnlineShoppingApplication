package com.anjawanj.orders.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="ORDERS")
public class Order {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ORDER_ID")
    private Integer id;

    @Column(name="ACCOUNT_EMAIL_ID",unique=true)
    @NotNull
    @Size(max = 100)
    @Email
    private String accountEmailID;

    public String getAccountEmailID() {
		return accountEmailID;
	}

	public void setAccountEmailID(String accountEmailID) {
		this.accountEmailID = accountEmailID;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	
	public Order() {
	}


	@OneToMany(cascade=CascadeType.ALL)
    @JoinTable(name="ORDER_ORDER_ITEMS",
	joinColumns= {@JoinColumn(name="ORDER_ID",referencedColumnName="ORDER_ID")},
	inverseJoinColumns= {@JoinColumn(name="ORDER_ITEM_ID",referencedColumnName="ORDER_ITEM_ID")})
    private List<OrderItem> orderItems;

	public Order(String accountEmailID, List<OrderItem> orderItems) {		
		this.accountEmailID = accountEmailID;
		this.orderItems = orderItems;
	}

	
}