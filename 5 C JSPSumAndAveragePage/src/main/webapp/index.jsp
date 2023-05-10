<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sum And Average</title>
</head>
<body>
	<h1></h1>
	<%
		int n1=Integer.parseInt(request.getParameter("num1"));
		int n2=Integer.parseInt(request.getParameter("num2"));
		int n3=Integer.parseInt(request.getParameter("num3"));
		
		int sum=(n1+n2+n3);
		
		double average=(double)sum/3;
		
		out.print("<h3>The Sum is :  "+sum+"</h3>");
		out.print("<h3>The Average is : "+average+"</h3>");
	%>
</body>
</html>