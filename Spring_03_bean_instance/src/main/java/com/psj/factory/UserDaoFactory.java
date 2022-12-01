package com.psj.factory;

import com.psj.dao.UserDao;
import com.psj.dao.impl.UserDaoImpl;
// 实例工厂创建对象
public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
