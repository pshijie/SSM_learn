package com.psj.dao.impl;

import com.psj.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

// @Component和@Repository都可定义bean
// @Component("bookDao")
@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save ...");
    }
}
