package com.cart.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cart.model.UserDAO;
import com.cart.model.UserDTO;

public class Joinbtn implements Command {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String nick = request.getParameter("nick");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		
		UserDTO dto = new UserDTO(id, pw, name, nick, email, phone, email);
		UserDAO dao = new UserDAO();
		int row = dao.join(dto);
		if(row > 0) {
			// 성공 후 데이터를 가지고 이동할 페이지
			request.setAttribute("id", id);
			return "join-suc.jsp";
		}
		else {
			// 실패 후 이동할 페이지
			return "main.jsp";
		}

	}

}
