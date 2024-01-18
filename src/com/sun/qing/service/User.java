package com.sun.qing.service;

public class User {
    public User() {
        System.out.println("第一步：调用无参构造器");
    }
    String name;
    public void setName(String name) {
        System.out.println("第二步：注入属性");
        this.name = name;
    }

    public void initMy() {
        System.out.println("第二步：调用初始化函数");
    }

    public void destroyMy() {
        System.out.println("第五步：销毁");
    }

    public  void add() {
        System.out.println("User add......");
    }
}
