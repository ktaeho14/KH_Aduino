package com.product.model.dao;

import java.sql.Connection;
import java.util.List;

import com.product.model.dto.Product;

public class ProductDaoImpl implements ProductDao {

	@Override
	public List<Product> selectAll(Connection con) {
		return null;
	}

	@Override
	public Product selectOne(Connection con, String productId) {
		return null;
	}

	@Override
	public int insert(Connection con, Product p) {
		return 0;
	}

	@Override
	public int update(Connection con, Product p) {
		return 0;
	}

	@Override
	public int delete(Connection con, String productId) {
		return 0;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}

}