package com.in28mins.springboot.jpaandhibernate.course.jpa;

import com.in28mins.springboot.jpaandhibernate.course.beans.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJpaRepository courseJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        /*
        courseJpaRepository.insert(new Course(1,"Learn AWS Now!","in28mins"));
        courseJpaRepository.insert(new Course(2,"Learn AWS2 Now!","in28mins"));
        courseJpaRepository.insert(new Course(3,"Learn AWS3 Now!","in28mins"));

        courseJpaRepository.deleteById(3);

        Course course = courseJpaRepository.findById(2);
        System.out.println(course.toString());
         */
    }
}
