package com.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.mvc.dto.MyMVCDto;
import static common.JDBCTemplate.*;
public class MyMVCDaoImpl implements MyMVCDao {

	@Override
	public List<MyMVCDto> selectAll(Connection con) {
		PreparedStatement pstm = null;
		List<MyMVCDto> list = null;
		ResultSet rs = null;
		
		try {
			pstm = con.prepareStatement(selectAllsql);
			System.out.println("03. query 준비" + selectAllsql);
			rs = pstm.executeQuery();
			System.out.println("04. query 실행 및 리턴");
			
			if(rs.next()) {
				MyMVCDto tmp = new MyMVCDto(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)
								,rs.getDate(5));
				
				list.add(tmp);
			}
			
		} catch (SQLException e) {
			System.out.println("3/4단계 에러");
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstm);
			System.out.println("db종료 \n");
		}
		
		return list;
	}

	@Override
	public MyMVCDto selectOne(Connection con, int seq) {
		
		return null;
	}

	@Override
	public boolean insert(Connection con, MyMVCDto dto) {
		
		return false;
	}

	@Override
	public boolean update(Connection con, MyMVCDto dto) {
		
		return false;
	}

	@Override
	public boolean delete(Connection con, int seq) {
		
		return false;
	}

}
