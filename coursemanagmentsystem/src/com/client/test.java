package com.client;

import java.util.Scanner;

import org.hibernate.Session;

import com.config.HibernateUtil;
import com.deve.institute;


public class test {
public static void main(String[] args) {
	
	
	
	Scanner sc=new  Scanner(System.in);
	System.out.println("enter 1 for add new course 2 for view course 3 for update course 4 for delete course");
	int no=sc.nextInt();
	institute i=new institute();
	switch (no) {
	case 1: {
		i.addcourse();
		break;
		
	}
	case 2:{
		i.viewcourse();
		break;
	}
	case 3:{
		i.updatecourse();
		break;
		
	}
	case 4:{
		i.deletcourse();
		break;
	}
	}
	
}
}
