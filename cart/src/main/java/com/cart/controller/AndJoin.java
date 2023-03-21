package com.cart.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cart.model.UserDAO;
import com.cart.model.UserDTO;

public class AndJoin implements Command {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		String name = request.getParameter("user_name");
		String nick = request.getParameter("user_nick");
		String phone = request.getParameter("user_phone");

		UserDTO dto  = new UserDTO(id, pw, name, nick, phone);
		UserDAO dao = new UserDAO();

		int row = dao.AndJoin(dto);
		if(row > 0) {
			System.out.println(row);
			return null;
		}
		else {
			// 실패 후 이동할 페이지
			return "main.jsp";
		}

	}

}
