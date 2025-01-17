package com.in28minutes.learnspringboot.courses.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.learnspringboot.courses.bean.Course;
import com.in28minutes.learnspringboot.courses.repository.CourseRepository;

@RestController
public class CoursesController {

	@Autowired
	private CourseRepository repository;

	@GetMapping("/courses")
		public List<Course> getAllCourses() {
			// When we have a database
			return repository.findAll();

//		Below code is written when not using a database.			
//			return Arrays.asList(new Course(1, "Learn Microservices", "in28minutes"),
//					new Course(2, "Learn Java", "in28minutes"));
		}

		@GetMapping("/courses/{id}")
		public Course getCourseDetails(@PathVariable Long id) {
			Optional<Course> course = repository.findById(id);
			if (course.isEmpty()) {
				throw new RuntimeException("Course not found by id " + id);
			}
			return course.get();
		// Below code when no Database is used.
//		return new Course(1, "Learn Microservices easily", "in28minutes");
	}

	// POST - Create a new resourse or data entry into the DB
	@PostMapping("/courses")
	public void createCourse(@RequestBody Course course) {
		repository.save(course);
	}

	// PUT - Update/Replace a resource
	@PutMapping("/courses/{id}")
	public void updateCourse(@PathVariable Long id, @RequestBody Course course) {
		repository.save(course);
	}

	// DELETE - Delete a resource
	@DeleteMapping("/courses/{id}")
	public void deleteCourse(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
