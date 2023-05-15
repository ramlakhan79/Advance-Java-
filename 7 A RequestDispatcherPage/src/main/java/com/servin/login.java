package com.servin;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.PublicKey;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class login extends HttpServlet {
	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
	
		String uname ,pw;
		
		uname=req.getParameter("username");
		pw = req.getParameter("pw");
		
		if(uname.equals("sistec") &&  pw.equals("test")) {
			RequestDispatcher rd = req.getRequestDispatcher("/welcome");
			rd.forward(req,res);
		}
		else {
			out.print("Invalid  Credentials ");
			RequestDispatcher rd = req.getRequestDispatcher("UI.html");
			rd.include(req, res);
		}
		
	
	}
}
