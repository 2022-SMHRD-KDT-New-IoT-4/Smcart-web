package com.cart.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cart.model.UserDAO;
import com.cart.model.UserDTO;

public class AndLogin implements Command {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		System.out.println(id);
		System.out.println(pw);
		UserDTO dto = new UserDTO();
		dto.setuser_id(id);
		dto.setuser_pw(pw);
		UserDAO dao = new UserDAO();
		UserDTO user = dao.login(dto);
		response.getWriter().print(user);
		if(user != null) {
			System.out.println("비교함 :" + user);
		} 
		return null;
	}

}