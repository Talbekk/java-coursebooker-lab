package com.codeclan.example.coursebooker.components;

import com.codeclan.example.coursebooker.models.Course;
import com.codeclan.example.coursebooker.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args{
        Course course1 = new Course("Dragon Riding", "Throat of the World", 4);
        courseRepository.save(course1);

        Course course2 = new Course("Destruction Training", "Winterhold", 3);
        courseRepository.save(course2);
    }


}
