package com.spring.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	@Autowired
	private BoardMapper mapper;
	
	@Test
	public void testGetBoard() {
		log.info("--------------------");
		mapper.getList();
	}
	
	@Test
	public void testInsert() {
		BoardVO board = new BoardVO();
		board.setTitle("새글");
		board.setContent("새내용");
		board.setWriter("newbie");
		mapper.insert(board);
		log.info("==after insert: " + board.getBno());
	}
	
	@Test
	public void testInsertSelectKey() {
		BoardVO board = new BoardVO();
		board.setTitle("새글");
		board.setContent("새내용");
		board.setWriter("newbie");
		mapper.insertSelectKey(board);
		log.info("==after insert select key: " + board.getBno());
	}
	
	@Test
	public void testRead() {
		BoardVO board = mapper.read(2L);
		log.info(board);
	}
	
	@Test
	public void testDelete() {
		int count = mapper.delete(1L);
		log.info("==========" + count);
	}
	
	@Test
	public void testUpdate() {
		BoardVO board = new BoardVO();
		board.setBno(2L);
		board.setTitle("Update Title");
		board.setContent("Update Content");
		board.setWriter("user02");
		log.info("=======testUpdate : " + mapper.update(board));
	}
}
