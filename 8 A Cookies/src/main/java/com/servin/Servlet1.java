package com.servin;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name;
		name = req.getParameter("userName");		
		out.print("<h1>Hello "+name +" Welcome to Sistec</h1>");
		
		Cookie ck=new Cookie("userName", name);
		res.addCookie(ck);
	   
		out.print("<form action = 'servlet2'  method='post'> ");
		out.print(" <input type='submit' value='Go To Servlet 2' >");
		out.print("</form>");
		
	}
}
