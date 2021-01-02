package test.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.Action;
import common.ActionForward;
import test.vo.TestVo;

public class MainAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		TestVo vo = new TestVo();
    	vo.setName("이성일");
    	
    	request.setAttribute("test", vo);
    	
		ActionForward forward = new ActionForward();
		forward.setPath("/views/index.jsp");
		return forward;
	}

}
