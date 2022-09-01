package com.in28mins.springboot.jpaandhibernate.course.springdatajpa;

import com.in28mins.springboot.jpaandhibernate.course.beans.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

    //custom query
    List<Course> findByAuthor(String author);
    //custom query
    List<Course> findByName(String name);
}
