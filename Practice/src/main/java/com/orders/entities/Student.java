package com.orders.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="FS_STUDENT")
public class Student
{
	@Id
	@Column(name="STUDENT_ID")
	private int id;
	@Column(name="STUDENT_NAME")
	private String studentName;
	private int marks;
	private String city;

	@OneToMany(targetEntity = Subjects.class, cascade = CascadeType.ALL)
  //  @JoinColumn(name = "id", referencedColumnName = "STUDENT_ID") used update statement
	//private Collection<Subjects> subjects=new ArrayList<Subjects>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
//	public Collection<Subjects> getSubjects() {
//		return subjects;
//	}
//	public void setSubjects(Collection<Subjects> subjects) {
//		this.subjects = subjects;
//	}

	
	
	
	
}
