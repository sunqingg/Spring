package com.sun.qing.service.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller

public class UserController {
    @Value("abc")
    private String name;
    public void add() {
        System.out.println("UserController add ...");
        System.out.println("name: " + name);
    }
}
