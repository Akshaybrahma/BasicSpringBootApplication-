package com.batch.b33.Service;

import java.util.List;
import java.util.Optional;

import com.batch.b33.Entity.StudentEntity;

public interface ServiceInterface {
	public StudentEntity insertStudent(StudentEntity se);
	public List<StudentEntity> details();
	public Optional<StudentEntity> findByStudentId(Long studentId);
	public void deleteStudent(StudentEntity st);
}
