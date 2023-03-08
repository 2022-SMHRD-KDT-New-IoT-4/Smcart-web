package com.cart.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cart.model.BoardDAO;
import com.cart.model.BoardDTO;

public class Board implements Command {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO dao = new BoardDAO();
		List<BoardDTO> list = dao.boardselectall();
		if(list != null) {
			request.setAttribute("list", list);
			return "request.jsp";
		} else {
			return "main.jsp";
		}
	}

}
