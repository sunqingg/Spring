package com.sun.qing.service.config;

import com.sun.qing.service.UserService;
import com.sun.qing.service.dao.UserController;
import com.sun.qing.service.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"com.sun"})
public class SpringConfig {
    // AutoWired是需要在类中使用的时候才调用,ComponentScan相当于扫描包下面所有通过注解创建对象的类.
//    @Autowired
//    UserService userService;
//    @Autowired
//    UserDao userDao;
}
