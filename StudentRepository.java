package com.batch.b33.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.batch.b33.Entity.StudentEntity;
@Repository
public interface StudentRepository  extends JpaRepository<StudentEntity,Long>{

}
