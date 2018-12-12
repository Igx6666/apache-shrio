package com.shiro.mapper;

import com.shiro.entity.Permission;

public interface PermissionMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}