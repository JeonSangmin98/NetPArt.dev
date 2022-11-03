package com.webmarket.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.webmarket.domain.ProductVO;

@Service
public class ProductServiceImpl implements ProductService{

	@Override
	public void register(ProductVO product) {
		
	}

	@Override
	public ProductVO get(int p_id) {
		return null;
	}

	@Override
	public int modify(ProductVO vo) {
		return 0;
	}

	@Override
	public int remove(int p_id) {
		return 0;
	}

	@Override
	public List<ProductVO> getProducts() {
		return null;
	}
}