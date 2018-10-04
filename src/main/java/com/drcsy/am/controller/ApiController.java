package com.drcsy.am.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.drcsy.am.dto.Record;
import com.drcsy.am.service.RecordSVC;
import com.github.pagehelper.PageHelper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Drcsy-ApiController-Doc", tags = "患者病历接口")
@RestController
@RequestMapping("/api")
public class ApiController {
	@Autowired
	private RecordSVC rds;

	@GetMapping("/rd/{id}")
	public String getRdById(@PathVariable String id) {
		Record rd = rds.getRecordById(id);
		return rd.toString();
	}

	@ApiOperation("查询病历")
	@GetMapping("/rd2/{id}")
	public Record getRdById2(@PathVariable String id) {
		Record rd = rds.getRecordById(id);
		return rd;
	}

	@PostMapping("/rd/modByName")
	@ApiOperation(value = "修改姓名", notes = "根据患者姓名修改姓名,当且仅当匹配到一条记录时方可修改成功。")
//	@ApiImplicitParam(name = "newName",value="新名称",paramType="body",dataType="String")  dataType="String" 会引起前端显示异常信息
	public String modByName(@RequestParam(value = "oldName", required = true) String oldName,
			@RequestParam(value = "newName", required = true) String newName) {
		String msg = "处理异常";
		int num = rds.modByName(oldName, newName);
		if (num == 1) {
			msg = "修改成功：\n已将患者\t" + oldName + "\n修改为\t" + newName;
		}
		return msg + "\n查询过程涉及" + num + "条";
	}

	@PostMapping("/rd/saveRd")
	@ApiOperation(value = "查询病历", notes = "根据患者姓名、dicom ID查询病历")
	public int saveRd(@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "tel", required = false) String tel) {
		System.out.println("controller:" + name + "\n" + tel);
		int num = rds.saveRd(name, tel);
		return num;
	}

	@PostMapping("/rd/rds/{pageNum}/{pageSize}")
	public List<Record> queryRecord(@RequestParam(value = "patient_name", required = true) String patient_name,
			@RequestParam(value = "dicom_patient_id", required = false) String dicom_patient_id,
			@RequestParam(value = "pageNum", defaultValue="1",required = false) int pageNum,
			@RequestParam(value = "pageSize", defaultValue="10",required = false) int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Record> records = rds.queryRecords(patient_name, dicom_patient_id);
		return records;
	}

}
