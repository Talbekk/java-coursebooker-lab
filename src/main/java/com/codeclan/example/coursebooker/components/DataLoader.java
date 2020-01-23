package com.codeclan.example.coursebooker.components;

import com.codeclan.example.coursebooker.models.Booking;
import com.codeclan.example.coursebooker.models.Course;
import com.codeclan.example.coursebooker.models.Customer;
import com.codeclan.example.coursebooker.repository.BookingRepository;
import com.codeclan.example.coursebooker.repository.CourseRepository;
import com.codeclan.example.coursebooker.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        Course course1 = new Course("Dragon Riding", "Throat of the World", 4);
        courseRepository.save(course1);

        Course course2 = new Course("Destruction Training", "Winterhold", 3);
        courseRepository.save(course2);

        Course course3 = new Course("Dragon Riding", "Dragonstone", 3);
        courseRepository.save(course3);

        Customer customer1 = new Customer("Bilbo", "The Shire", 111);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Saruman", "Isengard", 300);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Dhaenrys", "Dragonstone", 21);
        customerRepository.save(customer3);

        Booking booking1 = new Booking("12-10-17", customer1, course1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("10-08-19", customer2, course2);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("01-08-16", customer3, course3);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("12-10--17", customer3, course1);
        bookingRepository.save(booking4);

    }


}
