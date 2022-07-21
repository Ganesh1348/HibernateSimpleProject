package com.orders.entities;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity(name="ORDERFIRSTTABLE")
@Table(name="orderfirstlevel")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class OrderFirstLevel 
{
@Id
@Column(name="firstid")
 private int orderId;
 private String orderReceiptDate;
 private String orderType;
 //private CustomerDetails cust;
 
 
public int getOrderId() {
	return orderId;
}
//public CustomerDetails getCust() {
//	return cust;
//}
//public void setCust(CustomerDetails cust) {
//	this.cust = cust;
//}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public String getOrderReceiptDate() {
	return orderReceiptDate;
}
public void setOrderReceiptDate(String orderReceiptDate) {
	this.orderReceiptDate = orderReceiptDate;
}
public String getOrderType() {
	return orderType;
}
public void setOrderType(String orderType) {
	this.orderType = orderType;
}
@Override
public String toString() {
	return "OrderFirstLevel [orderId=" + orderId + ", orderReceiptDate=" + orderReceiptDate + ", orderType=" + orderType
			+ "]";
}
 
 
 
}
