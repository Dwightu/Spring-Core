package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		try {
			// create object mapper
			ObjectMapper mapper=new ObjectMapper();
			
			// read JSON file and map/convert to Java POJO: 
			// data/sample-lite.json
			Student theStu=mapper.readValue(new File("data/sample-full.json"), Student.class);
			//print first name and last name
			System.out.println(theStu.getLastName());
			Address tempAddress=theStu.getAddress();
			
			System.out.println("Street = "+tempAddress.getStreet());
		}catch(Exception exc) {
			exc.printStackTrace();
		}
	}
	
}
