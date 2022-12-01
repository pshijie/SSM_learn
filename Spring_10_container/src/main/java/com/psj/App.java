package com.psj;

import com.psj.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // 1.加载类路径下的配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2.从文件系统下加载配置文件（需要写绝对路径）
//        ApplicationContext ctx = new FileSystemXmlApplicationContext("xxx\\applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        BookDao bookDao = ctx.getBean("bookDao",BookDao.class);
//        BookDao bookDao = ctx.getBean(BookDao.class);
//        bookDao.save();
    }
}
