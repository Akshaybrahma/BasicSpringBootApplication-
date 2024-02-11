package com.batch.b33.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class StudentEntity {
	@Id
	@GeneratedValue(strategy=jakarta.persistence.GenerationType.IDENTITY)
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "full_name", nullable = false)
	
	private String fullName;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String name) {
		this.fullName = name;
	}
	public StudentEntity() {}
	public StudentEntity(int i,String name) {
		this.id=i;
		this.fullName=name;
	}
	public String toString() {
		return "StudentEntity [id=" + id + ", Name=" + fullName + "]";
	}
}
