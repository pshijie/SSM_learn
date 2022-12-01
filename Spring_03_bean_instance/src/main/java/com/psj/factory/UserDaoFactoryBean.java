package com.psj.factory;

import com.psj.dao.UserDao;
import com.psj.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;
// FactoryBean创建对象
public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    // 代替原始实例工厂中创建对象的方法(相当于统一了方法名为getObject)
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    public Class<?> getObjectType() {
        return UserDao.class;
    }

    // 如果要设置为单例/非单例，还可以实现isSingleton方法(不实现就取默认值-单例)
}
