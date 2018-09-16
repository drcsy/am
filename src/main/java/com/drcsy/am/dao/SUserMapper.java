package com.drcsy.am.dao;

import com.drcsy.am.dto.SUser;

public interface SUserMapper {
    int deleteByPrimaryKey(String ID);

    int insert(SUser record);

    int insertSelective(SUser record);

    SUser selectByPrimaryKey(String ID);

    int updateByPrimaryKeySelective(SUser record);

    int updateByPrimaryKey(SUser record);
}