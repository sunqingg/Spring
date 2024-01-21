package com.sun.qing.service;

import com.sun.qing.dao.BookDao;
import com.sun.qing.dao.UserDao;
import com.sun.qing.pojo.Account;
import com.sun.qing.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookService {
    @Autowired
    BookDao bookDao;
    @Autowired
    private UserDao userDao;
    Book book;
    public void add(Book book1){
        this.book = book1;
        bookDao.add(book);
    }
    public void update(Book book1){
        this.book = book1;
        bookDao.updateBook(book);
    }
    @Transactional
    public void accountMoney() {
        //lucy 少 100
        Account lucy = new Account(100, "lucy");
        userDao.reduceMoney(lucy);
        int num  = 10/0;
        Account mary = new Account(100, "mary");
        //mary 多 100
        userDao.addMoney(mary);
    }
}
