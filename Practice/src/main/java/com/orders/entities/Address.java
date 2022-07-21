package com.orders.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_ADDRESS")
public class Address 
{
@Column(name="ADDRESS")
 private String address;
@OneToOne(targetEntity = Student.class)
@JoinColumn(name = "id", referencedColumnName = "STUDENT_ID")
private Student student;
@Id
private int houseNo;


public int getHouseNo() {
	return houseNo;
}
public void setHouseNo(int houseNo) {
	this.houseNo = houseNo;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}




}
