package com.orders.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.orders.entities.Student;
import com.orders.entities.Student_dance;
import com.orders.entities.Student_sports;
import com.orders.entities.Subjects;
import com.orders.entities.Address;
import com.orders.entities.Dance;
import com.orders.entities.Sports;

public class commonDao
{
	

//	public static Boolean student(Session session) 
//	{
//		Sports s=new Sports();
//		Student_sports ssports=new Student_sports();
//		
//		try {
//			
//	   
//	   
//			 ssports.setStudentid(5);
//			   ssports.setsName("Name1");
//			  
//			   session.save(ssports);
//			   
//			   s.setsId(2);
//			   s.setsName("cricket");
//			   s.setSportsid(ssports);
//			   
//			  	
//				session.save(s);	
//		
//			return true;
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//			return false;
//		}
//	}
	
	public static Boolean oneTomany(Session session) {
		
		Student_dance student_dance=new Student_dance();
		Student_dance student_dance2=new Student_dance();
		Dance dance=new Dance();
		
		try {
			
	   student_dance.setName("ramya");
	   student_dance2.setName("priya");
	   
	   List<Student_dance> list=new ArrayList<Student_dance>();
	   list.add(student_dance2);
	   list.add(student_dance);
	   
	   dance.setDanceId(102);
	   dance.setDanceName("western");
	   dance.setDancers(list);
	   
	   session.save(dance);
	   	
		
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
}
