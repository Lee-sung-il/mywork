package test.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import common.Action;
import common.ActionForward;
import test.vo.TestVo;

public class LoginprocAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("id");
        String pwd = request.getParameter("pwd");
        if(!(id.equals("test") && pwd.equals("1111"))) {
        	response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('로그인 정보를 확인해주세요.');history.back();</script>");
			out.close();
			return null;
        }
        	HttpSession session = request.getSession();
        	session.setAttribute("id", id);
        	
        	
        	
			ActionForward forward = new ActionForward();
			forward.setPath("/");
			forward.setRedirect(true);
			return forward;
		
	}

}
