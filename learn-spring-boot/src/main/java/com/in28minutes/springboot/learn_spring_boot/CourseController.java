package com.in28minutes.springboot.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CourseController {
	
	// /courses
	// Return : Course : id, name, author
	
	@RequestMapping("/courses")
	public List<Course> retrieveAll(){
		return Arrays.asList(
				new Course(1, "Learn AWS", "in28minutes"),
				new Course(2, "Learn Devops", "in28minutes"),
				new Course(3, "Learn GCP", "in28minutes"),
				new Course(3, "Learn Java", "in28minutes")
				);
	}

}
