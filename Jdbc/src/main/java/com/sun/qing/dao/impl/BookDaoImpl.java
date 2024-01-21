package com.sun.qing.dao.impl;

import com.sun.qing.dao.BookDao;
import com.sun.qing.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        String sql = "insert into t_book values(?,?,?)";
        Object[] args = {book.getUserId(), book.getUserName(), book.getUstatus()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println("更新行数:"+ update);
    }
    @Override
    public void updateBook(Book book) {
        String sql = "update t_book set user_name=?,ustatus=? where user_id=?";
        Object[] args = {book.getUserName(), book.getUstatus(),book.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }
}
