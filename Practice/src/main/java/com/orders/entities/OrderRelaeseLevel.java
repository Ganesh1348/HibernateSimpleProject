package com.orders.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class OrderRelaeseLevel {
	
	@Id
	private int releaseId;
	private int loadNo;
	private int stopNo;
	@OneToOne
	private OrderFirstLevel order;
	public int getReleaseId() {
		return releaseId;
	}
	public void setReleaseId(int releaseId) {
		this.releaseId = releaseId;
	}
	public int getLoadNo() {
		return loadNo;
	}
	public void setLoadNo(int loadNo) {
		this.loadNo = loadNo;
	}
	public int getStopNo() {
		return stopNo;
	}
	public void setStopNo(int stopNo) {
		this.stopNo = stopNo;
	}
	public OrderFirstLevel getOrder() {
		return order;
	}
	public void setOrder(OrderFirstLevel order) {
		this.order = order;
	}

}
