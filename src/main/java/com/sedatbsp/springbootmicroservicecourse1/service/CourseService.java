package com.sedatbsp.springbootmicroservicecourse1.service;

import com.sedatbsp.springbootmicroservicecourse1.model.Course;

import java.util.List;

public interface CourseService {
    Course createCourse(Course course);

    void deleteCourse(Long courseId);

    List<Course> findAllCourse();
}
