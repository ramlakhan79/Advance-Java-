package com.servin;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet {
	protected void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String uname ;		
		uname=req.getParameter("username");
		
		out.print("<html><body>");
		out.print("<h1>Welcome : "+uname+"</h1>");
		out.print("<a href='UI.html'>Go Back </a>");
		out.print("</body></html>");
	}
}
