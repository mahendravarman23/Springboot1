package com.example.user3;

public class User {

    private int id;
    private String name;
    private String department;

    public User(int id, String name, String department){
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getDepartment(){
        return department;
    }
}