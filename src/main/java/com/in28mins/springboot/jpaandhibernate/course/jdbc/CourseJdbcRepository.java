package com.in28mins.springboot.jpaandhibernate.course.jdbc;

import com.in28mins.springboot.jpaandhibernate.course.beans.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private String INSERT_SQL = "insert into course(id,name,author) values(?,?,?)";
    private String DELETE_SQL = "delete from course where id=?";
    private String SELECT_SQL = "select * from course where id=?";

    public void insert(Course course){
        jdbcTemplate.update(INSERT_SQL,
                course.getId(),
                course.getName(),
                course.getAuthor());
    }

    public void delete(long id){
        jdbcTemplate.update(DELETE_SQL,id);
    }

    public Course findById(long id){
        return jdbcTemplate.queryForObject(SELECT_SQL,new BeanPropertyRowMapper<>(Course.class),id);
    }
}
