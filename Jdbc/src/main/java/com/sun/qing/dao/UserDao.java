package com.sun.qing.dao;

import com.sun.qing.pojo.Account;

public interface UserDao {
    void reduceMoney(Account account);

    void addMoney(Account account);
}
