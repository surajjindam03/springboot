package com.in28minutes.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.Course;
import com.in28minutes.springboot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
	
//	@Autowired
//	private CourseJdbcRepository repository;

//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		repository.insert(new Course(1, "Learn AWS", "Amazon"));
//		repository.insert(new Course(2, "Learn Azure", "Amazon"));
//		repository.insert(new Course(3, "Learn GCP", "Google"));
//		
//		repository.deleteById(2);
//		
//		System.out.println(repository.selectById(3));
//		System.out.println(repository.selectById(1));
		
		repository.save(new Course(1, "Learn AWS", "Amazon"));
		repository.save(new Course(2, "Learn Azure", "Amazon"));
		repository.save(new Course(3, "Learn GCP", "Google"));
		
		repository.deleteById(2L);
		
		System.out.println(repository.findById(3l));
		System.out.println(repository.findById(1l));
		
		System.out.println(repository.findByAuthor("Amazon"));
	}

}
