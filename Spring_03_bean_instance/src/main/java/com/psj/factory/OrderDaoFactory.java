package com.psj.factory;

import com.psj.dao.OrderDao;
import com.psj.dao.impl.OrderDaoImpl;
// 静态工厂创建对象
public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        System.out.println("factory setup....");
        return new OrderDaoImpl();
    }
}
