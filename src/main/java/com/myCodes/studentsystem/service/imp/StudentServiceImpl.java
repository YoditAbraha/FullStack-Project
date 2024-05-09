package com.myCodes.studentsystem.service.imp;

import com.myCodes.studentsystem.model.Student;
import com.myCodes.studentsystem.repositories.StudentRepository;
import com.myCodes.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

@Autowired
private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
