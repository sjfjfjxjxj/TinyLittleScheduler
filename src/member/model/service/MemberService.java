package member.model.service;

import java.sql.Connection;

import common.JDBCTemplate;
import member.model.dao.MemberDAO;

public class MemberService {
	private MemberDAO mDao;
	public MemberService() {
		mDao = new MemberDAO();
	}

	public int checkLogin(String memId, String memPw) {
		int result = 0;
		Connection conn = JDBCTemplate.getConnection();
		result = mDao.checkLogin(conn, memId, memPw);
		return result;
	}

}
