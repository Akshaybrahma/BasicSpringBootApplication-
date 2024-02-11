package com.batch.b33.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.batch.b33.Entity.StudentEntity;
import com.batch.b33.Exception.ResourceNotFoundException;
import com.batch.b33.Service.StudentServiceImp1;

@RestController
@RequestMapping("/Student")
public class Controller {

	@Autowired private StudentServiceImp1 StudentService;
	@GetMapping("/name")
	public String diaplay() {
		return "Akshay";
	}
	@PostMapping("/lamda")
	public StudentEntity insert(@Valid @RequestBody StudentEntity st) {
		System.out.println("Controller"+st);
		return StudentService.insertStudent(st);
	}
	@GetMapping("/get")
	public List<StudentEntity> GetDetails(@Valid @RequestBody StudentEntity st) {
		return StudentService.details();
	}
	@GetMapping("/get/{id}")
	public ResponseEntity getElementById(@PathVariable(value = "id") Long studentId) throws ResourceNotFoundException{
		StudentEntity st = StudentService.findByStudentId(studentId)
				.orElseThrow(() -> new ResourceNotFoundException("student not found for this id :: " + studentId));
				return ResponseEntity.ok().body(st);
	}
	@PutMapping("/update/{id}")
	public ResponseEntity updateDetails(@PathVariable(value = "id") Long studentId,@Valid @RequestBody StudentEntity st) throws ResourceNotFoundException{
			StudentEntity se=StudentService.findByStudentId(studentId)
			.orElseThrow(()->new ResourceNotFoundException("Student not found for this id:"+studentId));
			se.setFullName(st.getFullName());
			StudentEntity st1=StudentService.insertStudent(se);
		return ResponseEntity.ok(st1);	
	}
	@DeleteMapping("delete/{id}")
	public Map deleteStudent(@PathVariable(value="id")Long studentId)throws ResourceNotFoundException {
		StudentEntity st = StudentService.findByStudentId(studentId)
				.orElseThrow(()->new ResourceNotFoundException("Student not found for this id:"+studentId));
		StudentService.deleteStudent(st);
		Map response=new HashMap<>();
		response.put("deleted",Boolean.TRUE);
		return response;
	}
}
