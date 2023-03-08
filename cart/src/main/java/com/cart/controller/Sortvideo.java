package com.cart.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sortvideo implements Command {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sort = request.getParameter("sort");
		String search = request.getParameter("search");
		request.setAttribute("search", search);
		//  sort 컬럼명 종류에 따라 sendRedirect로 새롭게 각각의 Servlet을 생성해서 그쪽으로 보내서 해야하나?
		if(sort.equals("video_id")) {
			return "";
		} else if(sort.equals("module_id")) {
			
		} else if(sort.equals("user_id")) {
			
		} 
		return null;
	}

}
