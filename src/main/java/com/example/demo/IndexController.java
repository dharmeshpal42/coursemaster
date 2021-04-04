package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Course;
import com.example.demo.service.CourseService;

@Controller
public class IndexController {
	@Autowired
	CourseService courseservice;
	
	@RequestMapping("/index")
	public String indexPage(HttpServletRequest request)
	{
		request.setAttribute("mode", "form");
		return "index.jsp";
	}
	
	
	@PostMapping("/insert")
	public String insertCourse(@ModelAttribute Course course,HttpServletRequest request)
	{
		courseservice.insertCourse(course);
		request.setAttribute("courses", courseservice.showall());
		request.setAttribute("mode", "show");
		return "index.jsp";
	}
	@RequestMapping("/showdata")
	public String showall(HttpServletRequest request)
	{
		request.setAttribute("courses", courseservice.showall());
		request.setAttribute("mode", "show");
		return "index.jsp";
		
	}
	@RequestMapping("/delete")
	public String deleteCourse(@RequestParam int courseId, HttpServletRequest request)
	{
		courseservice.deleteCourse(courseId);
		request.setAttribute("courses", courseservice.showall());
		request.setAttribute("mode","show");
		return "index.jsp";
	}
	
	@RequestMapping("/update")
	public String updateCourse(@RequestParam int courseId , HttpServletRequest request)
	{
		courseservice.getById(courseId);
		request.setAttribute("coursesedit", courseservice.getById(courseId));
		request.setAttribute("mode", "edit");
		return "index.jsp";
	}

}
