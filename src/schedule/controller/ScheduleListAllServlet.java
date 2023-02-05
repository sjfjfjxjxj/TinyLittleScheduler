package schedule.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.model.service.ScheduleService;
import schedule.model.vo.Schedule;

/**
 * Servlet implementation class ScheduleListAll
 */
@WebServlet("/schedule/list/all")
public class ScheduleListAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScheduleListAllServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String memId = (String)request.getAttribute("memId");
		ScheduleService scheService = new ScheduleService();
		
		if(session != null && (session.getAttribute("memId")!=null)){
			List<Schedule> scheList = scheService.selectAllSchedule(memId);
			request.setAttribute("scheList", scheList);
			request.getRequestDispatcher("/WEB-INF/views/schedule/listall.jsp").forward(request, response);			
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
