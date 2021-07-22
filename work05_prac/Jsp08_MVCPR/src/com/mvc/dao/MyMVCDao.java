package com.mvc.dao;

import java.sql.Connection;
import java.util.List;

import com.mvc.dto.MyMVCDto;

public interface MyMVCDao {
	
	String selectAllsql = "SELECT * FROM MYMVCBOARD ORDER BY SEQ DESC";
	
	public List<MyMVCDto> selectAll(Connection con);
	public MyMVCDto selectOne(Connection con, int seq);
	public boolean insert(Connection con, MyMVCDto dto);
	public boolean update(Connection con, MyMVCDto dto);
	public boolean delete(Connection con, int seq);
}
