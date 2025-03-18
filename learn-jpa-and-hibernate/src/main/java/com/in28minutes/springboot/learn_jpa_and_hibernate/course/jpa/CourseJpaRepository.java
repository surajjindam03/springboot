package com.in28minutes.springboot.learn_jpa_and_hibernate.course.jpa;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
	
//	@Autowired
	@PersistenceContext
	private EntityManager entityManger;
	
	public void insert(Course course) {
		entityManger.merge(course);
	}
	
	public Course selectById(long id) {
		return entityManger.find(Course.class, id);
	}

	public void deleteById(long id) {
		Course course = entityManger.find(Course.class, id);
		entityManger.remove(course);
	}
}
