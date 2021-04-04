package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Course;
import com.example.demo.repositery.CourseRepositery;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {

	
	@Autowired
	CourseRepositery repo;
	
	@Override
	public void insertCourse(Course course) {
		// TODO Auto-generated method stub
		repo.save(course);
	}

	@Override
	public List<Course> showall() {
		// TODO Auto-generated method stub
		return (List<Course>)repo.findAll();
	}

	@Override
	public void deleteCourse(int courseId) {
		// TODO Auto-generated method stub
		repo.deleteById(courseId);
		
	}

	@Override
	public Course getById(int courseId) {
		return repo.findById(courseId).get();
	}

	
	
}
