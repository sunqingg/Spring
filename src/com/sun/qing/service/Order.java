package com.sun.qing.service;

public class Order {
    //属性
    private String oname;
    private String address;
    //有参数构造
    public Order(String oname,String address) {
        this.oname = oname;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oname='" + oname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}