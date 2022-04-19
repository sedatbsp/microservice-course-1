package com.sedatbsp.springbootmicroservicecourse1.controller;

import com.sedatbsp.springbootmicroservicecourse1.model.Course;
import com.sedatbsp.springbootmicroservicecourse1.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping // api/course
    public ResponseEntity<?> createCourse(@RequestBody Course course) {
        courseService.createCourse(course);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("{courseId}") // api/course/{courseId}
    public ResponseEntity<?> deleteCourse(@PathVariable Long courseId) {
        courseService.deleteCourse(courseId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping // api/course
    public ResponseEntity<?> getAllCourses() {
        var courseList = courseService.findAllCourse();
        return ResponseEntity.ok(courseList);
    }

}
