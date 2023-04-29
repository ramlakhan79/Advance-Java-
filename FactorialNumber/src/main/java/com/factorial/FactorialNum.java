package com.factorial;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FactorialNum extends HttpServlet{
	protected void doPost(HttpServletRequest req ,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out =res.getWriter();
		
		int num,fact=1;
		num=Integer.parseInt(req.getParameter("number"));
		for(int i=1;i<num;i++) {
			fact=fact*i;
		}
		out.print("<html><body style=background:cyan>");
		out.print("<h2>"+"Factorial of Given Number is  :  "+fact+"</h2>");
		out.print("</body></html>");
	}
}