package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Nana extends HttpServlet {
	
	@Override
	public void service(HttpServletRequest req
						, HttpServletResponse resp) throws IOException {
		
		PrintWriter out = resp.getWriter();
		out.println("helloooooo");
	}
}