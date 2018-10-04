package com.drcsy.am.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.drcsy.am.dto.Record;
import com.drcsy.am.service.RecordSVC;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Drcsy-WebController-Doc", tags = "Web接口")
@Controller()
@RequestMapping("/web")
public class WebController {
	@Autowired
	private RecordSVC rds;

	@ApiOperation("Web页面查询病历")
	@ResponseBody
	@GetMapping("/rds")
	private String showRd(Map<String, String> map) {
		List<Record> listRd = rds.queryRecords("王进云", null);
		return JSON.toJSONString(listRd);
	}

//	@GetMapping("/rd")
//	private String showRds(Map<String, List<Record>> map) {
//		List<Record> listRd = rds.queryRecords("王进云", null);
//		map.put("listRd", listRd);
//		listRd.forEach(rd -> {
//			System.out.print("getId:" + rd.getId() + "\t");
//			System.out.println("getPatient_name:" + rd.getPatient_name() + "\t");
//		});
//		return "record";
//	}

}
