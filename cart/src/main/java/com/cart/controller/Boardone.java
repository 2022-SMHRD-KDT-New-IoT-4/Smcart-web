package com.cart.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cart.model.BoardDAO;
import com.cart.model.BoardDTO;

public class Boardone implements Command {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StringBuffer requestURL = request.getRequestURL();
		String queryString = request.getQueryString();
		String data = null;
		if(queryString == null) {
			data = requestURL.toString();
		} else {
			data = requestURL.append('?').append(queryString).toString();
		}
		data = data.substring(data.indexOf("=") + 1);
		System.out.println(data);
		BoardDTO dto = new BoardDTO();
		dto.setboard_seq((long)Integer.parseInt(data));
		
		BoardDAO dao = new BoardDAO();
		BoardDTO one = dao.select(dto);
		if(one != null) {
			request.setAttribute("one", one);
			return "board.jsp";
		} else {
			return "main.jsp";
		}
	}

}
