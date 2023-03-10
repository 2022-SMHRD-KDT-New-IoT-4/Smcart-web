package com.cart.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Main implements Command {
	private static final long serialVersionUID = 1L;
	

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String qr_code = request.getParameter("qr_code");
	
		if(qr_code != null) {
			System.out.println("모듈" + qr_code);
			
		}else {
			System.out.println("값이 없습니다.");
		}
		
		
		return "main.jsp";
	}

}
