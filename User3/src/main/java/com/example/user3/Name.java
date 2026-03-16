package com.example.user3;

import java.util.ArrayList;
import java.util.List;

public class Name {

    List<User> users = new ArrayList<>();

    public void addStudent(User u){
        users.add(u);
    }

    public void displayStudents(){
        for(User u : users){
            System.out.println(u.getId()+" "+u.getName()+" "+u.getDepartment());
        }
    }
}