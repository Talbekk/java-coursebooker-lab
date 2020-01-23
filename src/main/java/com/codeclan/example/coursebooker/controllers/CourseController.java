package com.codeclan.example.coursebooker.controllers;


import com.codeclan.example.coursebooker.models.Course;
import com.codeclan.example.coursebooker.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/rating/{rating}")
    public List<Course> findCourseByRating(@PathVariable int rating){
        return courseRepository.findCourseByRating(rating);
    }

    @GetMapping(value = "/customerId/{customerId}")
    public List<Course> findCoursesByBookingsCustomerId(@PathVariable long customerId){
        return courseRepository.findCoursesByBookingsCustomerId(customerId);
    }


}
