package com.webmarket.domain;

import lombok.Data;

@Data
public class ProductVO {
	private String p_id;
	private String p_name;
	private int p_unitprice;
	private String p_description;
	private String p_category;
	private String p_manufacturer;
	private int p_unitsinstock;
	private String p_condition;
	private String p_filename;
}
