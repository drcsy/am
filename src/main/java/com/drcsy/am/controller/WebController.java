package com.drcsy.am.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.drcsy.am.dto.Record;
import com.drcsy.am.service.RecordSVC;

@Controller()
@RequestMapping("/web")
public class WebController {
	@Autowired
	private RecordSVC rds;

	@GetMapping("/rds")
	private String showRd(Map<String, String> map) {
		List<Record> listRd = rds.queryRecords("王进云", null);
		map.put("listRd", JSON.toJSONString(listRd));
		return "records";
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
