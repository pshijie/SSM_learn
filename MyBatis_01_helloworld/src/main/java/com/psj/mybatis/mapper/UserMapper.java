package com.psj.mybatis.mapper;

import com.psj.mybatis.pojo.User;

import java.util.List;

/**
 * @author psj
 * @date 2022/11/15 21:20
 * @File: UserMapper.java
 * @Software: IntelliJ IDEA
 */
public interface UserMapper {
    /**
     * 添加用户信息
     */
    int insertUser();

    /**
     * 修改用户信息
     */
    void updateUser();

    /**
     * 删除用户信息
     */
    void deleteUser();

    /**
     * 根据用户Id获取用户信息
     */
    User getUserById();

    /**
     * 查询所有用户信息
     */
    List<User> getAllUser();
}
