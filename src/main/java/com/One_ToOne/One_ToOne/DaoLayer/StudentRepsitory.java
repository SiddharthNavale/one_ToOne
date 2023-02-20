package com.One_ToOne.One_ToOne.DaoLayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.One_ToOne.One_ToOne.entities.Student;

@Repository
public interface StudentRepsitory extends JpaRepository<Student,Integer> {

}
