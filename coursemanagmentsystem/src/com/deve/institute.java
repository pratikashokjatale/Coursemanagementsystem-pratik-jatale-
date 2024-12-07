package com.deve;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.config.HibernateUtil;
import com.inter.Courseopration;
import com.model.Course;

public class institute implements Courseopration{
	Session session = new HibernateUtil().getSessionFactory().openSession();
	Transaction tr;
	Course c;
	Scanner sc=new Scanner(System.in);
	@Override
	public void addcourse() {
		tr=session.beginTransaction();
		c=new Course();
		System.out.println("enter coursename");
		c.setCoursename(sc.next());
		System.out.println("enter course fee");
		c.setFee(sc.nextDouble());
		System.out.println(" enter instrutor");
		c.setInstructor(sc.next());
		session.save(c);
		tr.commit();
		
	}

	@Override
	public void viewcourse() {
		tr=session.beginTransaction();
		System.out.println("enter corse id for view student");
		Course c=session.get(Course.class, sc.nextLine());
		System.out.println("course id is" + c.getId());
		System.out.println(c.getCoursename());
		System.out.println(c.getFee());
		System.out.println(c.getInstructor());
		
	}

	@Override
	public void updatecourse() {
		tr=session.beginTransaction();
		System.out.println("enter corse id for view student");
		Course c=session.get(Course.class, sc.nextLine());
		System.out.println("enter 1 for update name 2 for update fee 3 for instrutor");
		int no=sc.nextInt();
		switch(no) {
		case 1:{
			System.out.println("update course");
			c.setCoursename(sc.next());
			break;
		}case 2:{
			System.out.println("update fee");
			c.setFee(sc.nextDouble());
			break;
		}case 3:{
			System.out.println("update instrutor");
			c.setInstructor(sc.next());
			break;
		}
		
		}
		tr.commit();
		
		
	}

	@Override
	public void deletcourse() {
		tr=session.beginTransaction();
		System.out.println("enter corse id for view student");
		Course c=session.get(Course.class, sc.nextLine());
		
		session.delete(c);
		tr.commit();
		
	}

}
