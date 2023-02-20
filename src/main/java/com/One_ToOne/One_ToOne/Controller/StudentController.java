package com.One_ToOne.One_ToOne.Controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.One_ToOne.One_ToOne.entities.Laptop;
import com.One_ToOne.One_ToOne.entities.Student;
import com.One_ToOne.One_ToOne.service.LaptopService;
import com.One_ToOne.One_ToOne.service.StudentService;


@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	
	@GetMapping("/students")
	public List <Student> getAllStudent(){
		
		return this.studentservice.getAllStudent();
		
	}
	@GetMapping("/students/{studentId}")
	@ResponseBody
	public Student getStudent(@PathVariable int studentId ) {
		
		return this.studentservice.getStudent(studentId);
		
	}
	
	@PostMapping("/students")
	@ResponseBody
	public Student addStudent(@RequestBody Student student) {
	
		return (this.studentservice.addStudent(student));
		 
	}
	
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student) {
		return (this.studentservice.updateStudent(student));
	}
	
	@DeleteMapping("/students/{studentId}")
	public void deleteStudentById (@PathVariable int studentId ){
		
		this.studentservice.deleteStudent(studentId);
		}
	

	
	
	

}
