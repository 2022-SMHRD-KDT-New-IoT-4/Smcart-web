package com.cart.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;

import com.cart.model.BasketDAO;
import com.cart.model.BasketDTO;
import com.cart.model.QrDAO;
import com.google.gson.Gson;

public class Barcode implements Command {
	private static final long serialVersionUID = 1L;
	public int row;

	// 들어갔나요?
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8"); //  인코딩
		
		BufferedReader bf = request.getReader();

		if (bf == null) {
			System.out.println("buffer = null");
			bf = null;
		}
		
		Object obj = JSONValue.parse(bf);
		// 모듈에서 바코드값 가져오기 (bc_input)
		JSONObject jobj = (JSONObject) obj;
		String bc_input = (String) jobj.get("bc_input");
		
		String res_type = (String) jobj.get("res_type");

		if (bc_input != null) {
			System.out.println("바코드앵오 : " + bc_input);

		} else {
			System.out.println("값이 없습니다.");
		}
		
		HttpSession session = request.getSession();
		BasketDAO dao = new BasketDAO();
		
		// 모듈에서 들어온 바코드값이 일치하는 상품 장바구니 테이블에 insert
		dao.InsertBasket(bc_input); // 바코드 찍었을때 DB에 들어감
		
		
		// ---------------------------------------------------------------------------------------------------------
	
		return null;
	}

}
