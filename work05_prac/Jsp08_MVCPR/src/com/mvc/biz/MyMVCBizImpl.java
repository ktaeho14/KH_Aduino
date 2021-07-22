package com.mvc.biz;

import static common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.List;

import com.mvc.dao.MyMVCDao;
import com.mvc.dao.MyMVCDaoImpl;
import com.mvc.dto.MyMVCDto;

import static common.JDBCTemplate.*;

public class MyMVCBizImpl implements MyMVCBiz{

	@Override
	public List<MyMVCDto> selectAll() {
		MyMVCDao dao = new MyMVCDaoImpl();
		Connection con = getConnection();
		List<MyMVCDto> list = dao.selectAll(con);
		
		close(con);
		return list;
	}

	@Override
	public MyMVCDto selectOne(int seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(MyMVCDto dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(MyMVCDto dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int seq) {
		// TODO Auto-generated method stub
		return false;
	}

}
