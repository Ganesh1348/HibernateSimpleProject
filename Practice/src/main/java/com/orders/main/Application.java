package com.orders.main;




import org.hibernate.service.ServiceRegistry;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.query.Query;

import com.orders.dao.commonDao;
import com.orders.entities.Address;
import com.orders.entities.CustomerDetails;
import com.orders.entities.Dance;
import com.orders.entities.OrderFirstLevel;
import com.orders.entities.OrderRelaeseLevel;
import com.orders.entities.Sports;
import com.orders.entities.Student;
import com.orders.entities.Student_dance;
import com.orders.entities.Student_sports;
import com.orders.entities.Subjects;

public class Application 
{
	public static void main(String args[]) {
		
		Boolean result=true;
		Boolean addressResult=true;
		
		Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Dance.class)
				.addAnnotatedClass(Student_dance.class);
		
		 ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                 .applySettings(con.getProperties()).build();
		SessionFactory sf=con.buildSessionFactory(serviceRegistry);
		Session session2=sf.openSession();
		
		//result=commonDao.oneTomany(session2);		
		
		Transaction tx=session2.beginTransaction();
		
		
		if(result) {
			tx.commit();
		}
		
		int b=101;
		
	//	Address a=new Address();
		
//		a=session.get(Address.class, 10);
//		
//		System.out.println(a);
		
//		Query q=session2.createQuery("select danceId,danceName from Dance");
//		
//		List<Object[]> danceId=(List<Object[]>)q.list();
//		
//		
//		
//		for(Object s:danceId) {
//			System.out.println(s.hashCode());
//		}
//		
//		
//		Query query=session2.createQuery("from Dance where danceId=:b");
//		query.setParameter("b", b);
//		
//		List<Dance> dance=query.getResultList();
//		
//		for(Dance d:dance) {
//			System.out.println(d);
//		}
//		
//		Session session=sf.openSession();
//		SQLQuery sql=session.createSQLQuery("select * from Dance");
//		
//	 sql.addEntity(Dance.class);
//	 
//	 List<Dance> dance1=sql.getQueryReturns();
		
	Criteria c=session2.createCriteria(Dance.class);
	
	c.setProjection(Projections.property("danceName"));
	
	c.addOrder(Order.desc("danceId"));
	
	List list=c.list();
	
	System.out.println(list);
	
	}
	public static void studentDetails() {
		
	}
	
}
