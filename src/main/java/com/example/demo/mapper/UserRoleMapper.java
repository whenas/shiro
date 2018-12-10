package com.example.demo.mapper;

import com.example.demo.entity.Role;

import java.util.List;

/**
 * Created by lusongjiong on 2018/12/10.
 */
public interface UserRoleMapper {
    List<Role> findByUserName(String userName);
}
