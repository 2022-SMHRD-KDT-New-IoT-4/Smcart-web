package com.cart.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.cart.model.BasketDAO;
import com.cart.model.BasketDTO;
import com.cart.model.ProductDAO;
import com.cart.model.ProductDTO;

public class Product implements Command {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProductDTO dto = new ProductDTO();
		dto.setprod_seq(null); // 상품 아이디
		
		ProductDAO dao = new ProductDAO();
		List<ProductDTO> list = dao.select(dto);
		if(list != null) {
			JSONArray array = new JSONArray();
			for(int i = 0;i < list.size();i++) {
				JSONObject data = new JSONObject();
				data.put("prod_seq", list.get(i).getprod_seq());
				data.put("prod_name", list.get(i).getprod_name());
				data.put("prod_price", list.get(i).getprod_price());
				data.put("prod_loc", list.get(i).getprod_loc());
				data.put("prod_img", list.get(i).getprod_img());
				data.put("prod_stock_yn", list.get(i).getprod_stockyn());
				array.add(data);
			}
			response.getWriter().print(array);
			System.out.println(array);
		}
		
		return null;
	}

}
