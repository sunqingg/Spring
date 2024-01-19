package com.sun.qing.service;

import com.sun.qing.service.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public void add(){
        System.out.println("UserService add ..." );
    }
    public void annotationUse() {
        userDao.add();
    }
}
