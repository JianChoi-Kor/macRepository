package com.koreait.webfirst;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test2")
public class TestServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String msg = request.getParameter("msg");
		System.out.println("msg : "+msg);
		System.out.println("너는 get방식으로 요청을 했을 것이여!");
		String jsp = "/WEB-INF/jsp/test2.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("너는 post방식으로 요청을 했을 것이여!");
		String msg = request.getParameter("msg");
		String title = request.getParameter("title");
		String ctnt = request.getParameter("ctnt");
		
		System.out.println("msg : "+ msg);
		System.out.println("title : "+ title);
		System.out.println("ctnt : "+ ctnt);
		
		response.sendRedirect("/test1");
	}

}
