package com.example.assignment3;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class Controller {

    User dao = new User();

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student s) {
        dao.addStudent(s);
        return "Student Added";
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return dao.getStudents();
    }
}