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
	/**
	 * @return the courseId
	 */
	public int getCourseId() {
		return courseId;
	}
	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	/**
	 * @return the courseFees
	 */
	public int getCourseFees() {
		return courseFees;
	}
	/**
	 * @param courseFees the courseFees to set
	 */
	public void setCourseFees(int courseFees) {
		this.courseFees = courseFees;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseFees=" + courseFees + "]";
	}
	
	
	
	
}
