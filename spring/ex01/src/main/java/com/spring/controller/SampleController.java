package com.spring.controller;

import java.util.ArrayList;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.domain.SampleDTO;
import com.spring.domain.SampleDTOList;
import com.spring.domain.TodoDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {

	@RequestMapping(value = "/basic", method = { RequestMethod.GET, RequestMethod.POST })
	public void basic() {
		log.info("basic..........");
	}

	@GetMapping("/basicGET")
	public void basicGet() {
		log.info("basicGET..........");
	}

//	http://localhost:8080/sample/ex01?name=aaa&age=17
//	String age = request.getParameter("age");
//	String name = request.getParameter("name");
//	SampleDTO = new SampleDTO();
//	dto.setAge(Integer.parseInt(age));
//	dto.setName(name);
	@GetMapping("/ex01")
	public String ex01(SampleDTO dto) {
		log.info("ex01: " + dto);
		return "ex01";
	}
	
	@GetMapping("/ex02List")
	public void ex02List(@RequestParam("ids") ArrayList<String> ids) {
		log.info("ids: " + ids);
	}
	
//	/sample/ex02Bean?list[0].name=aaa&list[0].age=15	/	[] : 유효하지 않은 문자
//	/sample/ex02Bean?list%5B0%5D.name=aaa&list%5B0%5D.age=15	/	[ : %5B, ] : %5D
	@GetMapping("/ex02Bean")
	public void ex02Bean(SampleDTOList list) {
		log.info("...list: " + list);
	}
	
//	/sample/ex03?title=test&dueDate=2022/10/26
	@GetMapping("/ex03")
	public void ex03(TodoDTO todo) {
		log.info("...todo:" + todo);
	}
	
//	http://localhost:8080/sample/ex04?name=aaa&age=15&page=10
	@GetMapping("/ex04")
	public String ex04(SampleDTO dto,@ModelAttribute("page") int page) {
		log.info("dto : " + dto);
		log.info("page : " + page);
		return "/sample/ex04";
	}
	
	@GetMapping("/ex06")
	public @ResponseBody SampleDTO ex06() {
		log.info("/ex06....");
		SampleDTO dto = new SampleDTO();
		dto.setAge(20);
		dto.setName("홍길동");
		return dto;
	}
	
	@GetMapping("/ex07")
	public ResponseEntity<String> ex07(){
		log.info("/ex07....");
		String msg = "{\"name\":\"홍길동\"}";
		HttpHeaders header = new HttpHeaders();
		header.add("Content-Type", "application/json;charset=UTF-8");
		return new ResponseEntity<>(msg,header,HttpStatus.OK);
	}
}// SampleController
