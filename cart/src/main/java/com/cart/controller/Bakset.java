package com.cart.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.cart.model.BasketDTO;
import com.cart.model.ProductDAO;
import com.cart.model.ProductDTO;
import com.cart.model.QrDAO;
import com.cart.model.RecyclerDAO;
import com.cart.model.RecyclerDTO;

public class Bakset implements Command {
	private static final long serialVersionUID = 1L;
	

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		
		BasketDTO dto = new BasketDTO();
	
		RecyclerDAO dao = new RecyclerDAO();
		
		List<RecyclerDTO> list = dao.select();


		return null;
	}

}
