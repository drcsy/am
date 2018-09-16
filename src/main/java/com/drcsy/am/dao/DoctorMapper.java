package com.drcsy.am.dao;

import com.drcsy.am.dto.Doctor;

public interface DoctorMapper {
    int insert(Doctor record);

    int insertSelective(Doctor record);

    Doctor selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);
}