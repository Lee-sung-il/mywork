package helloworldtest.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/test.do")
public class TestController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		String id = request.getParameter("id");
        String pwd = request.getParameter("pwd");
        System.out.println(id);
        System.out.println(pwd);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");  
		/*String[] checked = request.getParameterValues("dog");
		
		for(int i = 0; i < checked.length; i++) {
			System.out.println(checked[i]);*/
		String id = request.getParameter("id");
        String pwd = request.getParameter("pwd");
        if(id.equals("abcd") && pwd.equals("1111")) {
        	HttpSession session = request.getSession();
        	session.setAttribute("id", id);
        	response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>location.href='index.jsp';</script>");
			out.close();
			return;
		}else {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('로그인 정보를 확인해주세요.');history.back();</script>");
			out.close();
			return;
		}
		
	}

}
