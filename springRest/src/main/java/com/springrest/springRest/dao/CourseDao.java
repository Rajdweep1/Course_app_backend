package com.springrest.springRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springRest.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

}
