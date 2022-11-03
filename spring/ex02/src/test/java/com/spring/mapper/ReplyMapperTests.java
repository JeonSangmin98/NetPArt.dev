package com.spring.mapper;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.domain.ReplyVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTests {
	@Autowired
	private ReplyMapper mapper;
	private Long[] bnoArr = { 24580L, 24579L, 24578L, 24577L, 24576L };

	@Test
	public void testMapper() {
		log.info("--------------");
		log.info(mapper);
	}

	@Test
	public void testCreate() {
		IntStream.rangeClosed(1, 10).forEach(i -> {
			ReplyVO vo = new ReplyVO();
			// 게시물의 번호
			vo.setBno(bnoArr[i % 5]);
			vo.setReply("댓글 테스트 " + i);
			vo.setReplyer("replyer" + i);
			mapper.insert(vo);
		});
	}
	@Test
	public void testRead() {
		Long targetRno = 5L;
		ReplyVO vo= mapper.read(targetRno);
		log.info("=====" + vo);
	}
	@Test
	public void testDelete() {
		Long targetRno = 5L;
		int count= mapper.delete(targetRno);
		log.info("=====" + count);
	}	
	@Test
	public void testUpdate() {
		ReplyVO vo = mapper.read(2L);
		vo.setReply("update reply");
		int count= mapper.update(vo);
		log.info("=====testUpdate:" + count);
	}	
	@Test
	public void testList() {
		List<ReplyVO> replies= mapper.getListWithPaging(null, bnoArr[1]);
		replies.forEach(reply->log.info(reply));
	}	
}
