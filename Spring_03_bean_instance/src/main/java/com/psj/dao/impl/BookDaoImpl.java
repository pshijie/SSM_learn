package com.psj.dao.impl;

import com.psj.dao.BookDao;

public class BookDaoImpl implements BookDao {

    private BookDaoImpl() {
        System.out.println("book dao constructor is running ....");
    }

    public void save() {
        System.out.println("book dao save ...");
    }

}
