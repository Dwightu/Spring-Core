package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.cfg.Configuration;



public class CreateStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory=new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create Session
		Session session=factory.getCurrentSession();
		
		try {
		// create a student object
			System.out.println("creating new student object...");
			Student tempStudent=new Student("Diwght","Yu","dwy@luv2code.com");
			session.beginTransaction();
			
			System.out.println("Saving the student");
			session.save(tempStudent);
			
			//Commit session
			System.out.print("done!!");
			
			
			// Get a student
			System.out.println("Get a student");
			System.out.println(session.get(Student.class, tempStudent.getId()));
			System.out.println("I get it!!");
			
			// Delete a Student
			System.out.println("Delete a Student");
			session.delete(tempStudent);
			session.getTransaction().commit();
			
		}finally {
			factory.close();
		}
		
	}

}
