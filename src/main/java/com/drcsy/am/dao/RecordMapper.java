package com.drcsy.am.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.drcsy.am.dto.Record;

public interface RecordMapper {
	int deleteByPrimaryKey(String id);

	int insert(Record record);

	int insertSelective(Record record);

	Record selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(Record record);

	int updateByPrimaryKey(Record record);

	int modByName(String oldName, String newName);

	List<Record> getByName(String name);

	int saveRd(String patient_name, String patient_tel);
	
	List<Record> queryRecords(String patient_name, String dicom_patient_id);
}