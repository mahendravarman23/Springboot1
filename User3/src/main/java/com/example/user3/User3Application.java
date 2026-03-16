package com.example.user3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class User3Application {

    public static void main(String[] args) {

        Name dao = new Name();

        User s1 = new User(1,"Mahendra","CSE");
        User s2 = new User(2,"Ravi","IT");

        dao.addStudent(s1);
        dao.addStudent(s2);

        dao.displayStudents();

        SpringApplication.run(User3Application.class, args);
    }
}