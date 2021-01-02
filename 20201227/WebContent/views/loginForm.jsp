<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<header>
<%@include file="header.jsp" %>
</header>
<form action="loginproc.do" method="post">

<input type="text" name="id" placeholder="아이디">
<br>
<input type="password" name="pwd"placeholder="비밀번호">
<br>
<input type="submit" value="로그인">

</form>
<footer>
<%@include file="footer.jsp" %>
</footer>
</body>
</html>