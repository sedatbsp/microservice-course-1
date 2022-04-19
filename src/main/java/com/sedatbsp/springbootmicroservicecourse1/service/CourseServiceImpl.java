package com.sedatbsp.springbootmicroservicecourse1.service;

import com.sedatbsp.springbootmicroservicecourse1.model.Course;
import com.sedatbsp.springbootmicroservicecourse1.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course createCourse(Course course) {
        course.setCreateTime(LocalDateTime.now());
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long courseId) {
        courseRepository.deleteById(courseId);
    }

    @Override
    public List<Course> findAllCourse() {
        return courseRepository.findAll();
    }

}
