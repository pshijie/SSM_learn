package com.psj.service.impl;

import com.psj.dao.BookDao;
import com.psj.service.BookService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// @Component和@Service都可定义bean
// @Component
@Service
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
