package com.Spring.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.Entity.Student;

@RestController
public class TestStudent {
	
	Student stud = new Student () ;
	
	List<Student> list = new ArrayList <>();
	
	
	
	@GetMapping("/student")
	public List<Student>  getstudent() {	
		stud.setId(1);
		stud.setName("dhiraj");
		stud.setSrname("birajdar");
		stud.setRollno(10);
		list.add(stud);
		
		return list ;
		
	}
	
	@PostMapping("/student")
	public String postStudent( @RequestBody Student student) {
		list.add(student);
		
		return "save Successfully" ;
		
	}

	
	
}
