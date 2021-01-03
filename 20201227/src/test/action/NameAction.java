package test.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.Action;
import common.ActionForward;
import test.service.TestService;
import test.vo.TestVo;

public class NameAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		TestVo vo = new TestVo();
		String name = request.getParameter("name");
		
		TestService svc = new TestService();
		boolean isSuccess = svc.insertName(name);
		if(!isSuccess) {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('이름을 저장하는데 실패하였습니다.');history.back();</script>");
			out.close();
			return null;
		}
		ActionForward forward = new ActionForward();
		forward.setPath("/");
		forward.setRedirect(true);
		return forward;
	}

}
