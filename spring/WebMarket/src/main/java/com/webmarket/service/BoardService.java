package com.webmarket.service;

import java.util.List;

import com.webmarket.domain.BoardVO;

public interface BoardService {
	public void register(BoardVO board);

	public BoardVO get(Long bno);

	public int modify(BoardVO vo);

	public int remove(Long bno);

	public List<BoardVO> getList();
}
