package com.Spring.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.Entity.Courses;


@RestController
public class TestCourses {
	
	@GetMapping("course")
	public  List<Courses> getall(){
		return Arrays.asList( new Courses (1 , "java" , "6 months"),
				                        new Courses (1 , "java" , "6 months")  );
		
	}
	

}
