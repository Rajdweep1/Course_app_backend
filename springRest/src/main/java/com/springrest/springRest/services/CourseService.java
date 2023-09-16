package com.springrest.springRest.services;

import java.util.List;
import com.springrest.springRest.entities.Course;

public interface CourseService {

	public List<Course> getCourses();

	public Course getCourse(String courseId);

	public void addCourse(Course course);

	public void updateCourse(Course course);

	public void deleteCourse(String courseId);
}
