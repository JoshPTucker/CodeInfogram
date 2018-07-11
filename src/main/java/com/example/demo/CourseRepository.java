package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Set;

public interface CourseRepository extends CrudRepository<Course, Long> {
  Set<Course> findCoursesByActiveIsTrue();
}
