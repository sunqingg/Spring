package com.sun.qing.dao.impl;

import com.sun.qing.dao.UserDao;
import com.sun.qing.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void reduceMoney(Account account) {
        String sql = "update t_account set money = money-? where username = ?";
        Object[] args = {account.getMoney(),account.getUsername()};
        jdbcTemplate.update(sql,args);
    }

    @Override
    public void addMoney(Account account) {
        String sql = "update t_account set money = money+? where username = ?";
        Object[] args = {account.getMoney(),account.getUsername()};
        jdbcTemplate.update(sql,args);
    }
}
