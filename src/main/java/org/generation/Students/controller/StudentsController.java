package org.generation.Students.controller;

import org.generation.Students.data.entity.Student;
import org.generation.Students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentsController{
    private final StudentService studentService;

    public StudentsController( @Autowired StudentService studentService )
    {
        this.studentService = studentService;
    }
    @GetMapping("/students")
    public Iterable<Student> getstudents() {
        return studentService.all();
    }

}
