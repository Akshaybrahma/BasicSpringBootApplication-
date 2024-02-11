package com.batch.b33.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.batch.b33.Entity.StudentEntity;
import com.batch.b33.Repository.StudentRepository;

@Service
public class StudentServiceImp1 implements ServiceInterface{

	@Autowired private StudentRepository strepo;
	public StudentEntity insertStudent(StudentEntity se) {
		System.out.println("Student Service"+se);
		strepo.save(se);
		return se;	
	}
	public List<StudentEntity> details() {
		return strepo.findAll();	
	}
	public Optional<StudentEntity> findByStudentId(Long studentId) {	
		return strepo.findById(studentId);
	}
	public void deleteStudent(StudentEntity st) {
		strepo.delete(st);
		
	}

}
