package com.marvin.demo.dao;

import com.marvin.demo.entity.UsersBean;

public interface UsersBeanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UsersBean record);

    int insertSelective(UsersBean record);

    UsersBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UsersBean record);

    int updateByPrimaryKey(UsersBean record);
}