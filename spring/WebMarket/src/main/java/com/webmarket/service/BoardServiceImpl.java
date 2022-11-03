package com.webmarket.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.webmarket.domain.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{

	@Override
	public void register(BoardVO board) {
		
	}

	@Override
	public BoardVO get(Long bno) {
		return null;
	}

	@Override
	public int modify(BoardVO vo) {
		return 0;
	}

	@Override
	public int remove(Long bno) {
		return 0;
	}

	@Override
	public List<BoardVO> getList() {
		return null;
	}
	
}
