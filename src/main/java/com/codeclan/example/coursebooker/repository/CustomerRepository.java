package com.codeclan.example.coursebooker.repository;

import com.codeclan.example.coursebooker.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.parser.Part;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findCustomersByBookingsCourseId(Long courseId);

    List<Customer> findCustomersByBookingsCourseNameIgnoreCaseAndBookingsCourseTownIgnoreCase(String courseName, String courseTown);

    List<Customer> findCustomersByTownIgnoreCaseAndBookingsCourseId(String town, long courseId);

    List<Customer> findCustomersByBookingsCourseNameIgnoreCaseAndBookingsCourseTownIgnoreCaseAndAgeGreaterThan(String courseName, String courseTown, int age);

    List<Customer> findCustomersByTownIgnoreCaseAndBookingsCourseIdAndAgeGreaterThan(String town, long courseId, int age);
}
