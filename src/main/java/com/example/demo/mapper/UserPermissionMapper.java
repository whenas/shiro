package com.example.demo.mapper;

import com.example.demo.entity.Permission;

import java.util.List;

/**
 * Created by lusongjiong on 2018/12/10.
 */
public interface UserPermissionMapper {

    List<Permission> findByUserName(String userName);
}
