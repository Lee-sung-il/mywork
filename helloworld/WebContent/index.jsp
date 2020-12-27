<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- request     response --%>
    
    <%
    	String id = (String) session.getAttribute("id");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="test.jsp">테스트페이지이동</a><br>
<a href="views/test.jsp">테스트페이지이동</a>
<br>
<a href="views/gugudan.jsp">구구단출력</a>
<br>
<a href="test.do">서블릿테스트</a>
<br>
<a href="checkBox.jsp">체크박스 테스트</a>
<br>
<%if (id == null) {%>
<a href="getType.jsp">로그인</a>
<%}else{ %>
<a href="Logout.do">로그아웃</a>
<%} %>
</body>
</html>