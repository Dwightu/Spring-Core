package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	List<Student> theStu;

	@PostConstruct
	public void loadData() {
		theStu=new ArrayList<>();
		theStu.add(new Student("Poornima","Patel"));
		theStu.add(new Student("Mario","Rossi"));
		theStu.add(new Student("Mary","Me"));
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		return theStu;
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		
		// check the studentId against list size
		if(studentId>=theStu.size()||(studentId<0)){
			throw new StudentNotFoundException("Student id not Found - "+studentId);
		}
		return theStu.get(studentId);
		
	}
	
}
