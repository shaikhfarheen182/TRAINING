package com.group.ServletExample;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	
	@Override
	public void service(HttpServletRequest req ,HttpServletResponse res) throws IOException {
		System.out.println("IN SERVICE");
	
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		out.println("<h2><b>hiiiii</h2><b>");
	}

}
