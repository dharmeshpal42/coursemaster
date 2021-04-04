package com.example.demo.repositery;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Course;

public interface CourseRepositery extends CrudRepository<Course,Integer>
{

}
