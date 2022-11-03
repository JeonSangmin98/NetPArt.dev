package com.webmarket.domain;

import lombok.Data;

@Data
public class BoardVO {
	private Long num;
	private String id;
	private String name;
	private String subject;
	private String content;
	private String regist_day;
	private int hit;
	private String ip;
}