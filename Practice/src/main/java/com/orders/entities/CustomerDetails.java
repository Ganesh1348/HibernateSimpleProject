package com.orders.entities;

import javax.persistence.Cacheable;
import javax.persistence.Embeddable;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Embeddable
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class CustomerDetails 
{

	private int customerInt;
	private String customerName;
	private int pinCode;
	public int getCustomerInt() {
		return customerInt;
	}
	public void setCustomerInt(int customerInt) {
		this.customerInt = customerInt;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	
}
