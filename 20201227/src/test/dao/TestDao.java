package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.vo.TestVo;
import static common.jdbcUtil.*;
public class TestDao {
	
	private Connection con;
	
	private TestDao() {
		
	}
	
	public static TestDao getInstance() {
		return LazyHolder.INSTANCE;
	}
	
	private static class LazyHolder {
		private static final TestDao INSTANCE = new TestDao();
	}
	
	public void setConnection(Connection con) {
		this.con = con;
	}
	
	public int insertName(TestVo vo) {
		PreparedStatement pstmt = null;
		int count = 0;
		try {
			pstmt = con.prepareStatement("insert into test(name) values(?)");
			pstmt.setString(1, vo.getName());
			count=pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return count;
	}
	public int insertName(String name) {
		PreparedStatement pstmt = null;
		int count = 0;
		try {
			pstmt = con.prepareStatement("insert into test(name) values(?)");
			pstmt.setString(1, name);
			count=pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return count;
	}
}
