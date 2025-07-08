package com.example.demo.restapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	 private int roolNo;
	@Column (name = "student_name")
	 private String name;
	@Column(name = "student _percentage")
	 private float percentage;
	@Column(name="student_branch")
	 private String branch;
	 
	
}
