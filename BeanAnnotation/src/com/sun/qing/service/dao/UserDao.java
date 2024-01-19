package com.sun.qing.service.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public void add() {
        System.out.println("UserDao add...");
    }
}
