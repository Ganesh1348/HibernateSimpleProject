package com.orders.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

@Entity
public class Dance 
{
	@Id
 private int danceId;
 private String danceName;
 @OneToMany(cascade = CascadeType.ALL)
//@JoinColumn(name="did")   
 private List<Student_dance> dancers;
 
public int getDanceId() {
	return danceId;
}
public void setDanceId(int danceId) {
	this.danceId = danceId;
}
public String getDanceName() {
	return danceName;
}
public void setDanceName(String danceName) {
	this.danceName = danceName;
}
public List<Student_dance> getDancers() {
	return dancers;
}
public void setDancers(List<Student_dance> dancers) {
	this.dancers = dancers;
}
@Override
public String toString() {
	return "Dance [danceId=" + danceId + ", danceName=" + danceName + ", dancers=" + dancers + "]";
}
 
 
}
