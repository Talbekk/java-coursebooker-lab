package com.codeclan.example.coursebooker;

import com.codeclan.example.coursebooker.models.Booking;
import com.codeclan.example.coursebooker.models.Course;
import com.codeclan.example.coursebooker.models.Customer;
import com.codeclan.example.coursebooker.repository.BookingRepository;
import com.codeclan.example.coursebooker.repository.CourseRepository;
import com.codeclan.example.coursebooker.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CoursebookerApplicationTests {

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	void contextLoads() {
	}
	@Test
	public void findCourseByRating(){
		List<Course> found = courseRepository.findCourseByRating(4);
		assertEquals("Dragon Riding", found.get(0).getName());
	}

	@Test
	public void findCustomersByBookingsCourseId(){
		List<Customer> found = customerRepository.findCustomersByBookingsCourseId(1L);
		assertEquals("Bilbo", found.get(0).getName());
	}

	@Test
	public void findCoursesByBookingsCustomerId(){
		List<Course> found = courseRepository.findCoursesByBookingsCustomerId(1L);
		assertEquals("Dragon Riding", found.get(0).getName());
	}

	@Test
	public void findBookingsByDate(){
		List<Booking> found = bookingRepository.findBookingsByDate("12-10-17");
		assertEquals("Bilbo", found.get(0).getCustomer().getName());
		assertEquals(1L, found.get(0).getId());
	}

	@Test
	public void findCustomersByBookingsCourseNameAndBookingsCourseTown(){
		List<Customer> found = customerRepository.findCustomersByBookingsCourseNameAndBookingsCourseTown("Dragon Riding", "Throat of the World");
		assertEquals("Bilbo", found.get(0).getName());
	}

	@Test
	public void findCustomersByTownAndCourseId(){
		List<Customer> found = customerRepository.findCustomersByTownAndBookingsCourseId("Dragonstone", 3L);
		assertEquals("Dhaenrys", found.get(0).getName());
	}





}
