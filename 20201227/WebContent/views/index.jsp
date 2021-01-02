<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="test.vo.TestVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	TestVo vo = (TestVo) request.getAttribute("test");
    	String id = (String) session.getAttribute("id");
    	
    	
    	 //Enumeration  e = request.getHeaderNames();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<%--<header>
<%@include file="header.jsp" %>
</header>
<div>
현재 시간은 <%=new SimpleDateFormat().format(new Date()) %>입니다.
</div>
<%=vo.getName() %><br>
 --%>
<%if(id == null) {%>
<a href="login.do">로그인</a>
<%}else{ %>
<a href="logout.do">로그아웃</a> <%} %>
<a href="forwardTest.do">포워드 테스트</a>
<%-- 
<div>
<h1>헤더정보</h1>
<table>
<tr>
<td>헤더이름
</td>
<td>헤더정보</td>
</tr>
<%while(e.hasMoreElements()){ %>
<%String headerName = (String) e.nextElement(); %>
<tr>
<td><%=headerName %></td>
<td><%=request.getHeader(headerName) %></td>
</tr>
<%} %>
</table>
</div>
--%>


<%-- 
<footer>
<%@include file="footer.jsp" %>
</footer>
--%>
</body>
</html>