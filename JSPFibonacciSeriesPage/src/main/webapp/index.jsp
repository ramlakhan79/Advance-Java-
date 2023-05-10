<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fibonacci Series</title>
</head>
<body>
		<h1> The Fibonacci Series is  </h1>
		<h1>
		<%
			int num=Integer.parseInt(request.getParameter("number"));
			int a=0,b=1,fSeries=0;
			//out.println("<h1> The Fibonacci Series is  </h1");
			
			for(int i=0;i<num;i++){
				if(i<=1){
					fSeries=i;
				}
				else{
					fSeries=a+b;
					a=b;
					b=fSeries;				
				}
				out.print("   "+fSeries);
			}
			
		%>
		</h1>
</body>
</html>