package com.example.demo.service;

import com.example.demo.model.Course;

import java.util.List;

public interface CourseService {

	public void insertCourse(Course course);
	public List<Course> showall();
	public Course getById(int courseId);
	public void deleteCourse(int courseId);
	
	
}
