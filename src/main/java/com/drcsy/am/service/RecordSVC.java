/**
 * 
 */
package com.drcsy.am.service;

import java.util.List;

import com.drcsy.am.dto.Record;

/**
 * @author Administrator
 *
 */
public interface RecordSVC {
	Record getRecordById(String id);

	int modByName(String oldName, String newName);

	int saveRd(String name, String tel);

	List<Record> queryRecords(String patient_name, String dicom_patient_id);
}
