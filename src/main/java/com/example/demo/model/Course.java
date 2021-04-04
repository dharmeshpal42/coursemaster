package com.example.demo.model;
import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name="course")
@Data
public class Course {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	
	private int courseId;
	private String courseName;
	private int courseFees;
	
	public Course()
	{
		
	}
}
