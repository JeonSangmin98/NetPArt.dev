package com.webmarket.mapper;
import java.util.List;

import com.webmarket.domain.ProductVO;

public interface ProductMapper {
	public List<ProductVO> getList();
	
	public void insert(ProductVO product);
	
	public ProductVO read(int p_id);
	
	public void delete(int p_id);
	
	public void update(ProductVO product);
}
