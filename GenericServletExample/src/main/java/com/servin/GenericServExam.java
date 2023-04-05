package com.servin;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class GenericServExam implements Servlet{

		ServletConfig config;
	
		
		@Override
		public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			// TODO Auto-generated method stub
			res.setContentType("text/html");
			
			PrintWriter out=res.getWriter();
			out.print("<html> <body>");
			out.print("<b>Servlet by Extending Generic Servlet Class </b>");
			out.print("<a href='index.html'>Go Back </a>");
			out.print("</body></html>");
			
		}

	
	@Override
	public void init(ServletConfig config) 
	{
		// TODO Auto-generated method stub
		this.config=config;
		System.out.println("Servlet is Initialized");
		
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Servlet is destroyed");
		
		
	}


	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	
}