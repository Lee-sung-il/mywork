<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	session.removeAttribute("id");

%>
<script>

	alert('세션값 삭제됨');

	location.href = 'index.jsp';

</script>
</body>
</html>