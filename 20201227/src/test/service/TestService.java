package test.service;

import java.sql.Connection;

import test.dao.TestDao;
import test.vo.TestVo;

import static common.jdbcUtil.*;

public class TestService {
	public boolean insertName(TestVo vo) {
		TestDao dao = TestDao.getInstance();
		Connection con = getConnection();
		dao.setConnection(con);
		boolean isSuccess = false;
		int count = dao.insertName(vo);
		if(count > 0 ) {
			commit(con);
			isSuccess = true;
		}else {
			rollback(con);
		}close(con);
		return isSuccess;
	}
}
