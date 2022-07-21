package com.orders.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Sports {
@Id
	private int sId;
	private String sName;
	@OneToOne
	private Student_sports sportsid;
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	
	public Student_sports getSportsid() {
		return sportsid;
	}
	public void setSportsid(Student_sports sportsid) {
		this.sportsid = sportsid;
	}
	@Override
	public String toString() {
		return "Sports [sId=" + sId + ", sName=" + sName + ", sportsid=" + sportsid + "]";
	}
	
	
}
