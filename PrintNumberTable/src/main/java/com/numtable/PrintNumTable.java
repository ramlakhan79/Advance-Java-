package com.numtable;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class PrintNumTable extends HttpServlet {
	protected void doPost(HttpServletRequest req ,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out =res.getWriter();
		
		int num;
		num=Integer.parseInt(req.getParameter("number"));
		out.print("<html><body style=background:cyan>");
		out.print("<h1>Table of Given Number is  as follows :</h1>");
		for(int i=1;i<=10;i++) {
			out.print("<h3 >"+num+"x"+i+"="+num*i+"</h3>");
		}
		out.print("</body></html>");
	}
}
