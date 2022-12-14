package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;



public class DeleteDemo {

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
			int id=1;
			
			session.beginTransaction();
			Instructor tempInstructor=session.get(Instructor.class, id);
			
			
			System.out.println("Found instructor: "+tempInstructor);
			
			//delete the instructors
			if(tempInstructor!=null) {
				System.out.println("Deleting "+tempInstructor);
				
				//Note: will also delete associated "details" object
				session.delete(tempInstructor);
			}

			session.getTransaction().commit();
			
		}finally {
			factory.close();
		}
		
	}

}
