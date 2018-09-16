package com.drcsy.am.dao;

import com.drcsy.am.dto.GMember;

public interface GMemberMapper {
    int deleteByPrimaryKey(String id);

    int insert(GMember record);

    int insertSelective(GMember record);

    GMember selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(GMember record);

    int updateByPrimaryKeyWithBLOBs(GMember record);

    int updateByPrimaryKey(GMember record);
}