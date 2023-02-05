package schedule.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import schedule.model.vo.Schedule;

public class ScheduleDAO {

	public List<Schedule> sellectAllSchedule(Connection conn, String memId) {
		String sql = "SELECT SCHE_DEADLINE, SCHE_OFFICIALCHECK, SCHE_TODO, SCHE_WITHWHOM, SCHE_TOWHERE FROM MEMBER_TB JOIN SCHEDULER_TB USING(MEM_ID) WHERE MEM_ID=? ORDER BY SCHE_DEADLINE";
		List<Schedule> scheList = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setNString(1, memId);
			ResultSet rset = pstmt.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return scheList;
	}
	
}
