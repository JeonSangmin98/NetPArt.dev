package com.webmarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webmarket.service.ProductService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/product/*")
public class ProductController {
	@Autowired
	private ProductService service;
	
	@GetMapping("/products")
	public void products(Model model) {
		log.info("----------products");
		model.addAttribute("products",service.getProducts());
	}
}