package com.sedatbsp.springbootmicroservicecourse1.repository;

import com.sedatbsp.springbootmicroservicecourse1.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {


}
