package com.bmpl.apps;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/Welcome")
public class WelcomeServlet extends HttpServlet {
	int counter;
	public void init(){
		counter= 1;
		System.out.println("Call once");
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		Date date = new Date();
		out.println("<html><head><title>Welcome Servlet Page</title><body>");
		out.println("<h1>Hello Servlet"+"Current Counter Value is "+counter+"&nbsp&nbsp"+"Current date and time"+date+"<h1>");//shows date dynamically
		out.println("<body><html>");
		counter++;
		out.close();
		
	}
}
