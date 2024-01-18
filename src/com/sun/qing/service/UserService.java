package com.sun.qing.service;

import com.sun.qing.dao.UserDao;

public class UserService {
    //创建 UserDao 类型属性，生成 set 方法
    private UserDao userDao1;
    public void setUserDao1(UserDao userDao) {
        this.userDao1 = userDao;
    }
    public void add() {
        System.out.println("service add...............");
        userDao1.update();
    }
}