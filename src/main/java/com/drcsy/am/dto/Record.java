package com.drcsy.am.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class Record implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;

	private String patient_id;

	private String patient_name;

	private String patient_tel;

	private String apply_doctor_id;

	private String diagnosis_doctor_id;

	private String operate_doctor_id;

	private String diagnosis_doctor_group_id;

	private String belong_hospital_id;

	private String move_hospital_id;

	private String move_doctor_id;

	private String image_see_id;

	private String check_point;

	private Integer check_point_number;

	private String check_type;

	private String check_function;

	private String department;

	private String report_status;

	private String report_status_desc;

	private String moved_status;

	private String moved_status_desc;

	private String report_type;

	private Date report_date;

	private Date check_date;

	private Date apply_date;

	private String outpatient;

	private String outhospital;

	private String outrecord;

	private String medical_history;

	private String ct_files;

	private Date modify_date;

	private Date create_date;

	private String remark;

	private String belong_hospital_code;

	private String dicom_patient_id;

	private Date accepts_date;

	private String patient_sex;

	private Date patient_birthday;

	private String patient_age;

	private String institution_name;

	private Date move_date;

	private String name_quanpin;

	private String name_first_pinyin;

	private String bespokeId;

	private String patinetRecord_status;

	private String record_check_body;

	public Record() {
	}

	public Record(String id, String patient_id, String patient_name, String patient_tel, String apply_doctor_id,
			String diagnosis_doctor_id, String operate_doctor_id, String diagnosis_doctor_group_id,
			String belong_hospital_id, String move_hospital_id, String move_doctor_id, String image_see_id,
			String check_point, Integer check_point_number, String check_type, String check_function, String department,
			String report_status, String report_status_desc, String moved_status, String moved_status_desc,
			String report_type, Date report_date, Date check_date, Date apply_date, String outpatient,
			String outhospital, String outrecord, String medical_history, String ct_files, Date modify_date,
			Date create_date, String remark, String belong_hospital_code, String dicom_patient_id, Date accepts_date,
			String patient_sex, Date patient_birthday, String patient_age, String institution_name, Date move_date,
			String name_quanpin, String name_first_pinyin, String bespokeId, String patinetRecord_status,
			String record_check_body) {
		super();
		this.id = id;
		this.patient_id = patient_id;
		this.patient_name = patient_name;
		this.patient_tel = patient_tel;
		this.apply_doctor_id = apply_doctor_id;
		this.diagnosis_doctor_id = diagnosis_doctor_id;
		this.operate_doctor_id = operate_doctor_id;
		this.diagnosis_doctor_group_id = diagnosis_doctor_group_id;
		this.belong_hospital_id = belong_hospital_id;
		this.move_hospital_id = move_hospital_id;
		this.move_doctor_id = move_doctor_id;
		this.image_see_id = image_see_id;
		this.check_point = check_point;
		this.check_point_number = check_point_number;
		this.check_type = check_type;
		this.check_function = check_function;
		this.department = department;
		this.report_status = report_status;
		this.report_status_desc = report_status_desc;
		this.moved_status = moved_status;
		this.moved_status_desc = moved_status_desc;
		this.report_type = report_type;
		this.report_date = report_date;
		this.check_date = check_date;
		this.apply_date = apply_date;
		this.outpatient = outpatient;
		this.outhospital = outhospital;
		this.outrecord = outrecord;
		this.medical_history = medical_history;
		this.ct_files = ct_files;
		this.modify_date = modify_date;
		this.create_date = create_date;
		this.remark = remark;
		this.belong_hospital_code = belong_hospital_code;
		this.dicom_patient_id = dicom_patient_id;
		this.accepts_date = accepts_date;
		this.patient_sex = patient_sex;
		this.patient_birthday = patient_birthday;
		this.patient_age = patient_age;
		this.institution_name = institution_name;
		this.move_date = move_date;
		this.name_quanpin = name_quanpin;
		this.name_first_pinyin = name_first_pinyin;
		this.bespokeId = bespokeId;
		this.patinetRecord_status = patinetRecord_status;
		this.record_check_body = record_check_body;
	}

}