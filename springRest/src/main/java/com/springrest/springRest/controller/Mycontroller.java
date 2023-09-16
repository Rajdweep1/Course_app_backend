package com.springrest.springRest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.springrest.springRest.entities.Course;
import com.springrest.springRest.services.CourseService;

@RestController
public class Mycontroller {
	@Autowired
	public CourseService service;
	
	@GetMapping("/home")
	public String home() {
		return "this is homepage";
	}
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.service.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.service.getCourse(courseId);
	}
	@PostMapping("/courses")
	public String addCourse(@RequestBody Course course) {
		this.service.addCourse(course);
		return "done";
	}
	
	
	@PutMapping("/courses")
	public String updateCourse(@RequestBody Course course) {
		this.service.updateCourse(course);
		return "done";
	}
	
	@DeleteMapping("/courses/{courseId}")
	public String deleteCourse(@PathVariable String courseId) {
		this.service.deleteCourse(courseId);
		return "done";
	}
}
