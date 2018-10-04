package com.drcsy.am.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "private-params.wxapp")
@Data
public class YmlConfiger {
	private String appid;
	private String secret;

}
