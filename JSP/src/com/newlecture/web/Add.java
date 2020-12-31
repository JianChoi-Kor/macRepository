package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class Add extends HttpServlet {
	
	@Override
	public void service(HttpServletRequest req
						, HttpServletResponse resp) throws IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		String x = req.getParameter("x");
		String y = req.getParameter("y");
		
		if(x.equals("") || y.equals("")) {
			out.println("입력된 값이 없습니다.");
		} else {
			int result = (Integer.parseInt(x)+Integer.parseInt(y));
			out.println("덧셈 결과 : "+result);
		}
	}
}


