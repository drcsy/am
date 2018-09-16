package com.drcsy.am.dao;

import com.drcsy.am.dto.Report;

public interface ReportMapper {
    int deleteByPrimaryKey(String id);

    int insert(Report record);

    int insertSelective(Report record);

    Report selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Report record);

    int updateByPrimaryKey(Report record);
}