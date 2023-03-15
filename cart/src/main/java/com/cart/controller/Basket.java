package com.cart.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cart.model.BasketDAO;
import com.cart.model.BasketDTO;

public class Basket implements Command {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BasketDAO dao = new BasketDAO();
		List<BasketDTO> list = dao.select();
		if(list != null) {
			
		}
		
		return null;
	}

}
