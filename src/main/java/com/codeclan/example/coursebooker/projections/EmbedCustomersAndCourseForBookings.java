package com.codeclan.example.coursebooker.projections;

import com.codeclan.example.coursebooker.models.Booking;
import com.codeclan.example.coursebooker.models.Course;
import com.codeclan.example.coursebooker.models.Customer;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedCustomersAndCourseForBookings", types = Booking.class)
public interface EmbedCustomersAndCourseForBookings {

    public Customer getCustomer();
    public Course getCourse();
}
