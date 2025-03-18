package com.in28minutes.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.Course;

@Repository
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String insertQuery = 
			"""
			INSERT INTO course(id, name, author)
				VALUES(?, ?, ?)
			
			""";
	
	private static String deleteQuery = 
			"""
			DELETE FROM course WHERE id = ?
			
			""";
	
	public static String selectQuery = 
			"""
			SELECT * FROM course WHERE id = ?
			""";
	
	public void insert(Course course) {
		springJdbcTemplate.update(insertQuery, course.getId(), course.getName(), course.getAuthor());
	}
	
	public void deleteById(long id) {
		springJdbcTemplate.update(deleteQuery, id);
	}
	
	public Course selectById(long id) {
		return springJdbcTemplate.queryForObject(selectQuery, new BeanPropertyRowMapper<>(Course.class), id);
	}
}
