package com.product.controller;

import java.util.List;

import com.product.model.biz.ProductBiz;
import com.product.model.biz.ProductBizImpl;
import com.product.model.dto.Product;

public class ProductController {
	
	private ProductBiz biz = new ProductBizImpl();

	public List<Product> selectAll() {
		List<Product> res = biz.selectAll();
		return res;
	}

	public Product selectOne(String productId) {
		return null;
	}

	public int insert(Product p) {
		return 0;
	}

	public int update(Product p) {
		return 0;
	}

	public int delete(String productId) {
		return 0;
	}
}