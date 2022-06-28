package com.example.course;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

import static java.lang.Integer.parseInt;
@CrossOrigin(origins  =  "http://localhost:3000")
@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

 @GetMapping("/course/{id}")
    public ResponseEntity<Courses> getCourseID(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(courseRepository.findByid(parseInt(id)));
    }

    @GetMapping("/courses")
    public ResponseEntity<List<Courses>> getCourses() {
        return ResponseEntity.status(HttpStatus.OK).body(courseRepository.findAll());

    }

    @PostMapping("/course")
    public ResponseEntity<String> createCourses(@RequestBody Courses course) {
        courseRepository.save(course);
        return ResponseEntity.status(HttpStatus.CREATED).body("New Course Added " + course.getName());
    }



}



