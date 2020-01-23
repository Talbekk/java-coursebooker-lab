package com.codeclan.example.coursebooker.repository;

import com.codeclan.example.coursebooker.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CourseRepository extends JpaRepository<Course, Long> {
}
