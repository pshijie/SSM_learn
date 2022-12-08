package com.psj.mybatis.test;

import com.psj.mybatis.mapper.UserMapper;
import com.psj.mybatis.pojo.User;
import com.psj.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author psj
 * @date 2022/11/15 21:43
 * @File: MyBatisTest.java
 * @Software: IntelliJ IDEA
 */
public class MyBatisTest {
    @Test
    public void testInsert() throws IOException {
        // 读取MyBatis的核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        // 通过核心配置文件所对应的字节输入流创建工厂类SqlSessionFactory，生产SqlSession对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);

        // 创建SqlSession对象，此时通过SqlSession对象所操作的sql都必须手动提交或回滚事务
//        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 创建SqlSession对象，此时通过SqlSession对象所操作的sql都会自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        // ------------------使用mapper接口--------------------
        // 通过代理模式创建UserMapper接口的代理实现类对象
        // 之所以不直接new是因为UserMapper是一个接口，无法直接new
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // 调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件
        // 通过调用的方法名匹配映射文件中的SQL标签，并执行标签中的SQL语句
        int result = userMapper.insertUser();  // 底层也是调用sqlSession.insert
        // ------------------使用mapper接口--------------------

        // ------------------不使用mapper接口--------------------
        // 通过SQL语句的唯一标识(namespace.sqlId)找到SQL并执行
//        int result = sqlSession.insert("com.psj.mybatis.mapper.UserMapper.insertUser");
        // ------------------不使用mapper接口--------------------

//        sqlSession.commit();  // 如果设置了自动提交就不需要了
        sqlSession.close();
        System.out.println("结果：" + result);
    }

    @Test
    public void testUpdate() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser();
        sqlSession.close();
    }
    @Test
    public void testDelete() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser();
        sqlSession.close();
    }

    @Test
    public void testGetUserById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById();
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void testGetAllUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> user = mapper.getAllUser();
        for (User u : user) {
            System.out.println(u);
        }
        sqlSession.close();
    }
}
