package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;



public class CreateDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory=new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
		
		// create Session
		Session session=factory.getCurrentSession();
		
		try {
			
			// Create the objects
			Instructor tempInstructor=new Instructor("Chad","Darby","darh7@12.com");
			InstructorDetail tempInstructorDetail=new InstructorDetail("http://itsdehui.com","Luy ou");
			
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			session.beginTransaction();
			
			session.save(tempInstructor);
			session.getTransaction().commit();
			
		}finally {
			factory.close();
		}
		
	}

}
