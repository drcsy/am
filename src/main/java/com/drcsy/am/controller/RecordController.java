package com.drcsy.am.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.drcsy.am.dto.Record;
import com.drcsy.am.service.RecordSVC;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Drcsy-ApiController-Doc", tags = "患者病历专用接口")
@RestController
@RequestMapping(value = "/rd")
public class RecordController {

//	@Autowired
//	private Record rd;

	@Autowired
	private RecordSVC rds;

	@ApiOperation("根据患者ID查询病历记录")
	@GetMapping(value = "/id/{id}")
	public Record getRecordById(@PathVariable String id) {
		try {
			Record record = rds.getRecordById(id);
			return record;
		} catch (Exception e) {
			e.printStackTrace();
			Record record = new Record();
			record.setId("error");
			return record;
		} finally {
			System.out.println("使用id查询了一次患者病历。");
		}
	}

	@ApiOperation("根据患者姓名查询病历记录")
	@GetMapping(value = "/patient_name/{patient_name}")
	public List<Record> getRecordByName(@PathVariable String patient_name) {
		List<Record> records = rds.queryRecords(patient_name, null);
		return records;
	}

	@ApiOperation("根据患者姓名查询病历记录")
	@PutMapping(value = "/patient_name/{patient_name_old}")
	public String putRecordByName(@PathVariable String patient_name_old,
			@RequestParam("patient_name_new") String patient_name_new) {
//		List<Record> records = rds.queryRecords(patient_name_old, null);
		String msg = "处理异常";
		if (patient_name_new != null && patient_name_new.length() != 0) {
			int num = rds.modByName(patient_name_old, patient_name_new);
			if (num == 1) {
				msg = "修改成功：已将患者\t" + patient_name_old + "\t修改为\t" + patient_name_new;
			}
			return msg + "\t查询过程涉及" + num + "条";
		}else {
			return msg+"：输入的新名称为空？";
		}
	}

}
