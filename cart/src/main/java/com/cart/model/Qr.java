package com.cart.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.cart.controller.Command;
import com.cart.model.QrDAO;

public class Qr implements Command {
	private static final long serialVersionUID = 1L;
	public int row;

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		
		String qr_code = request.getParameter("qr_code");
		QrDAO dao = new QrDAO();
		row = dao.SelectQr(qr_code);
		
		//session
		HttpSession session = request.getSession();
		session.setAttribute("row", row);
		
		
		PrintWriter out = response.getWriter();
	    out.print(row);
	    
	    System.out.println("들어가니? : "+row);
	    
		if(qr_code != null) {
			System.out.println(qr_code);
			
		}else {
			System.out.println("값이 없습니다.");
		}
		
		
		// null로 해야 결과값이 안드로 받아짐
		return null;
	}

}
