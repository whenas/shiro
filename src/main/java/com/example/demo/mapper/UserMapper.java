package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.User;

/**
 * Created by lusongjiong on 2018/12/10.
 */
public interface UserMapper extends BaseMapper<User> {
    User findByUserName(String userName);
}
