package com.in28mins.springboot.jpaandhibernate.course.jdbc;

import com.in28mins.springboot.jpaandhibernate.course.beans.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository courseJdbcRepository;

    @Override
    public void run(String... args) throws Exception {
        /*
        courseJdbcRepository.insert(new Course(1,"Learn AWS Now!","in28mins"));
        courseJdbcRepository.insert(new Course(2,"Learn AWS2 Now!","in28mins"));
        courseJdbcRepository.insert(new Course(3,"Learn AWS3 Now!","in28mins"));

        courseJdbcRepository.delete(3);

        Course course = courseJdbcRepository.findById(2);
        System.out.println(course.toString());
         */
    }
}
