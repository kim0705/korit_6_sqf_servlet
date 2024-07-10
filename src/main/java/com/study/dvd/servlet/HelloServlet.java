package com.study.dvd.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String name = "김준일";
//		
//		// 응답하기 전에 resp 세팅
//		resp.setContentType("text/html"); // text를 html코드로 읽음 
//		resp.setCharacterEncoding("utf-8");
//		
//		resp.getWriter().println("" 
//				+ "<html>"
//				+ "<head>"
//				+ "<title>hello</title>"
//				+ "</head>"
//				+ "<body>"
//				+ "<h1>Hello Servlet!!!</h1>"
//				+ "<h2>" + name + "</h2>"
//				+ "</body>"
//				+ "</html>");
//		
//	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String age = req.getParameter("age"); // 파라미터는 문자열로 옴

		System.out.println(name);
		System.out.println(age);

		req.getRequestDispatcher("/WEB-INF/views/hello.jsp").forward(req, resp);
	}

}