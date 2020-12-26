<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--view(jsp) -> controller(경로분배 - servlet) -> service(알고리즘) -> dao(데이터베이스처리)
    dto(vo)
     -->
    <%
    int a = 10;
    int b = 20;
    int c = a + b;
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
		for(int i=2; i<10; i++ ) {
			for(int j=1; j < 10; j++) {
				out.print(i +" * " + j +" = " + i*j);
				out.print("<br>");
				
			}
			out.print("<p>");
		} 
%>
<p>

</body>
</html>