package com.orders.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student_sports 
{
@Id

private int studentid;
private String sName;

public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public int getStudentid() {
	return studentid;
}
public void setStudentid(int studentid) {
	this.studentid = studentid;
}
@Override
public String toString() {
	return "Student_sports [studentid=" + studentid + ", sName=" + sName + "]";
}


	


}
