package com.drcsy.am.dao;

import com.drcsy.am.dto.Dicom;

public interface DicomMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dicom record);

    int insertSelective(Dicom record);

    Dicom selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dicom record);

    int updateByPrimaryKey(Dicom record);
}