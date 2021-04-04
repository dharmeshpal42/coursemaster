package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Course;
import com.example.demo.service.CourseService;

@RestController
public class RestControllers {

	@Autowired
	CourseService courseservice;
	
	@GetMapping("/Rest")
	public ModelAndView RestIndex()
	{
		ModelAndView modelAndView = new ModelAndView("Rest.jsp");
		return modelAndView;
	}
	
	@GetMapping(value="getallcourse",produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<Course> getallcourse()
	{
	List<Course> list = courseservice.showall();
	for(Course model: list)
	{
		System.out.println("course name"+model.getCourseName());	
	}
	return list;
	}
	
	@PostMapping("/insertCoursemaster")
	public void insertCourse(@RequestBody Course course)
	{
		courseservice.insertCourse(course);
	}
	
	@GetMapping("/courseByID/{id}")
	public Course getcourseById(@PathVariable("id") int id)
	{
		Course existCourse = courseservice.getById(id);
		return existCourse;
	}
	
	@GetMapping("updateCourse/{id}")
	public void updateCourse(@RequestBody Course course , @PathVariable("id") int id)
	{
		System.out.println("courseName : "+course.getCourseName()+" courseFees "+course.getCourseFees());
		courseservice.insertCourse(course);
		System.out.println("log =======>"+course.getCourseId());
	}
	
	@DeleteMapping("/deleteCourse/{id}")
	public void deleteCourse(@PathVariable("id") int id)
	{
		courseservice.deleteCourse(id);
	}
}
