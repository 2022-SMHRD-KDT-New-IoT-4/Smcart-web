package com.cart.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;

import com.cart.controller.Command;
import com.cart.model.QrDAO;

public class Barcode implements Command {
	private static final long serialVersionUID = 1L;
	public int row;

	// 들어갔나요?
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	BufferedReader bf = request.getReader();

		
	      if(bf == null){
	          System.out.println("buffer = null");
	          bf= null;
	        } 
	        Object obj = JSONValue.parse(bf);
	        
	        JSONObject jobj = (JSONObject)obj;
	        String bc_input = (String) jobj.get("bc_input");
	        
		
		BascketDAO dao = new BascketDAO();
		dao.InsertBasket(bc_input);
//		ProdDTO dto = new ProdDTO();
		

		HttpSession session = request.getSession();
		String row = (String) session.getAttribute("row");
		
		PrintWriter out = response.getWriter();
	    out.print(row);
	    System.out.println("들어가니? : "+row);
	    
	    
	    
		if(bc_input != null) {
			System.out.println(bc_input);
			
		}else {
			System.out.println("값이 없습니다.");
		}
		
		
		// null로 해야 결과값이 안드로 받아짐
		return null;
	}

}
