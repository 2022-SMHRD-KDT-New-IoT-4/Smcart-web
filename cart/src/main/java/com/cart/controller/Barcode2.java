package com.cart.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cart.model.BasketDAO;
import com.cart.model.BasketDTO;
import com.google.gson.Gson;

public class Barcode2 implements Command {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		//user_id 안드로이드에서 받아오기
		String user_id = "1";
		// 장바구니 테이블 조회
		BasketDAO dao = new BasketDAO();
		List<BasketDTO> basket_list = dao.SelectBasket();
		
		Gson gson = new Gson();
		PrintWriter out = response.getWriter();
		
		/*
		if ("barcode".equals(res_type)) {

			for (BasketDTO v : basket_list) {
				if (bc_input.equals(v.getProd_seq())) {
					String jsonArray = gson.toJson(v);
					out.print(jsonArray); // 장바구니 조회결과
					break;
				}
			}
			
		}
		*/ 
		// 위에 코드 정체를 모르겠음
		
		
			if (basket_list != null) {
				// json 구조로 바꾸고 out.print 하기
				String jsonArray = gson.toJson(basket_list);
				out.print(jsonArray); // 장바구니 조회결과
				System.out.println("basket_list는 : " + jsonArray);
			} else {
				System.out.println("basket_list는 null");
			}
		

		// null로 해야 결과값이 안드로 받아짐
		return null;
	}

}
