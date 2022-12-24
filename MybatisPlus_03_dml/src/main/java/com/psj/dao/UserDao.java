package com.psj.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.psj.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {
}
