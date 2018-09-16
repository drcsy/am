/**
 * 
 */
package com.drcsy.am.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drcsy.am.dao.RecordMapper;
import com.drcsy.am.dto.Record;
import com.drcsy.am.service.RecordSVC;

/**
 * @author Administrator
 *
 */
@Service
public class RecordSVCI implements RecordSVC {

	@Autowired
	private RecordMapper rdm;

	@Override
	public Record getRecordById(String id) {
		return rdm.selectByPrimaryKey(id);
	}

	@Override
	public int modByName(String oldName, String newName) {
		List<Record> rdList = rdm.getByName(oldName);
		int num = rdList.size();
		if (num == 1) {
			rdm.modByName(oldName, newName);
		}
		return num;
	}

	@Override
	public int saveRd(String name, String tel) {
		System.out.println("service impl:" + name + "\n" + tel);
		int num = rdm.saveRd(name, tel);
		return num;
	}

	@Override
	public List<Record> queryRecords(String patient_name, String dicom_patient_id) {
		List<Record> records = rdm.queryRecords(patient_name, dicom_patient_id);
		return records;
	}

}
