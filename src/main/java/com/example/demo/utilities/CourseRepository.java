package com.example.demo.utilities;

import com.example.demo.models.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface CourseRepository extends CrudRepository<Course, Long> {
  Set<Course> findCoursesByActiveIsTrue();
}
