package com.One_ToOne.One_ToOne.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.One_ToOne.One_ToOne.DaoLayer.LaptopRepository;
import com.One_ToOne.One_ToOne.DaoLayer.StudentRepsitory;
import com.One_ToOne.One_ToOne.entities.Laptop;
import com.One_ToOne.One_ToOne.entities.Student;

@Service
public class ImplementingStudentService implements StudentService {

	@Autowired
	private StudentRepsitory studentrepsitory;
	

	@Override
	public Student getStudent(int studentId) {
		
		return this.studentrepsitory.findById(studentId).get();
	}	

	@Override
	public Student addStudent(Student student) {
		studentrepsitory.save(student);
		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		return studentrepsitory.findAll();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentrepsitory.save(student);
	}

	@Override
	public void deleteStudent(int studentId) {
		Student student=studentrepsitory.findById(studentId).get();
		 studentrepsitory.delete(student);
	}

	
	
	
	
	
	
	

}
