package com.One_ToOne.One_ToOne.service;


import java.util.List;

import com.One_ToOne.One_ToOne.entities.Student;

public interface StudentService {
	
	public List<Student> getAllStudent();
	
	public Student getStudent(int studentId);
	
	public Student addStudent(Student student);
	
	public Student updateStudent (Student student);

	public void deleteStudent(int studentId);
	
	

}
