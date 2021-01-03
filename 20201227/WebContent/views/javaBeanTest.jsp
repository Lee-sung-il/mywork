<%@page import="test.vo.TestVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
    
    <jsp:useBean id="vo" class="test.vo.TestVo" scope="page"/>
    <jsp:setProperty name="vo" property="name" value="test!" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
자바빈 테스트 :<%=vo.getName() %>

자바빈 테스트1 : <jsp:getProperty name="vo" property="name"/>
</body>
</html>