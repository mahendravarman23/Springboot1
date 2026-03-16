package com.example.user3;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class Controller {

    List<User> users = new ArrayList<>();

    @GetMapping("/users")
    public List<User> getUsers(){
        return users;
    }
}