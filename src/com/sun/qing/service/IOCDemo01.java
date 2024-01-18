package com.sun.qing.service;

public class IOCDemo01 {
    // 1. xml解析其实就是为了获取类名，获取类字节码
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        // newInstance() 通过类字节码获取实例对象
        User user = User.class.newInstance();
        // 反射执行方法
        user.add();
    }
}
