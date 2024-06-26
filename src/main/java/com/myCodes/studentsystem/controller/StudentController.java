package com.myCodes.studentsystem.controller;

import com.myCodes.studentsystem.model.Student;
import com.myCodes.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
                return "New Student is added";
    }
    @GetMapping("/getAll")
    public List<Student> getAll(){
        return studentService.getAllStudents();

    }
}
