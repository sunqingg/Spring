package com.sun.qing.dao;

import com.sun.qing.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

// Dao不用加@Repository
public interface BookDao {

    public void add(Book book);
    public void updateBook(Book book);
}
