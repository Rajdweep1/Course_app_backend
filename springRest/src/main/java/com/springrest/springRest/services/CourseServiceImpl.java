package com.springrest.springRest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springRest.dao.CourseDao;
import com.springrest.springRest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseDao courseDao;
	

	public CourseServiceImpl() {

	}


	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}


	@Override
	public Course getCourse(String courseId) {
		return courseDao.getReferenceById(Long.parseLong(courseId));
	}


	@Override
	public void addCourse(Course course) {
		courseDao.save(course);
	}


	@Override
	public void updateCourse(Course course) {
		courseDao.save(course);
	}


	@Override
	public void deleteCourse(String courseId) {
		courseDao.deleteById(Long.parseLong(courseId));
	}




}
