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
		return null;
	}

}
