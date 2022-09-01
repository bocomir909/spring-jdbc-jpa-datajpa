package com.in28mins.springboot.jpaandhibernate.course.springdatajpa;

import com.in28mins.springboot.jpaandhibernate.course.beans.Course;
import com.in28mins.springboot.jpaandhibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseSpringDataJpaCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseSpringDataJpaRepository courseJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJpaRepository.save(new Course(1,"Learn AWS Now!","in28mins"));
        courseJpaRepository.save(new Course(2,"Learn AWS2 Now!","in28mins"));
        courseJpaRepository.save(new Course(3,"Learn AWS3 Now!","bojan"));

        courseJpaRepository.deleteById(1l);

        System.out.println(courseJpaRepository.findById(2l));
        System.out.println(courseJpaRepository.findAll());
        System.out.println(courseJpaRepository.findByAuthor("bojan"));
        System.out.println(courseJpaRepository.findByName("Learn AWS2 Now!"));
    }
}
