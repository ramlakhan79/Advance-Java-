<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Table</title>
</head>
<body>
	<h1>The Given No Table is Follow as : </h1>
	<%
		int num=Integer.parseInt(request.getParameter("number"));
		int t;
		for(int i=1;i<=10;i++){
			out.println("<h3> "+num+"*"+i+"="+num*i+"</h3>");
		}	
	%>
</body>
</html>