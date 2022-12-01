package com.psj;

import com.psj.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLifeCycle {
    public static void main(String[] args) {
        // ApplicationContext中没有close方法,所以将换成ClassPathXmlApplicationContext
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
        // 注册关闭钩子函数，在JVM退出之前回调此函数，关闭容器(让JVM记得关闭容器再退出)
        //ctx.registerShutdownHook();
        // 关闭容器
        ctx.close();  // 不执行上面注册语句，直接执行close也是可以的
    }
}
