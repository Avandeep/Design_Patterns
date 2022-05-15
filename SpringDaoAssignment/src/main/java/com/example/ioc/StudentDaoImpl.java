package com.example.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void create(Student student) {
		String sql = "insert into student value(?,?,?)";
		jdbcTemplate.update(sql, student.getId(),student.getName(),student.getTestScore());
	}
	@Override
	public void delete(int Id) {
		String sql = "delete from student where Id="+Id;
		jdbcTemplate.execute(sql);
	}
}
