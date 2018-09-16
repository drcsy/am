package com.drcsy.am.dao;

import com.drcsy.am.dto.Hospital;

public interface HospitalMapper {
    int deleteByPrimaryKey(String id);

    int insert(Hospital record);

    int insertSelective(Hospital record);

    Hospital selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Hospital record);

    int updateByPrimaryKeyWithBLOBs(Hospital record);

    int updateByPrimaryKey(Hospital record);
}