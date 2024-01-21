package com.sun.qing.dao.config;

import com.sun.qing.dao.UserDao;
import com.sun.qing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"com.sun"})
public class SpringConfig {
    @Autowired
    UserService userService;
    @Autowired
    UserDao userDao;
}
