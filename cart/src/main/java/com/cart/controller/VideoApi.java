package com.cart.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cart.model.QrDAO;
import com.cart.model.VideoDAO;
import com.cart.model.VideoDTO;
import com.cart.model.VideoRunDAO;

public class VideoApi implements Command {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		// 라파에서 
		// http://211.223.106.67:8081/cart/Video.do url로 접근했을 때
		// 실행되는 로직입니다 예호~~~~~
		
		
		
		//session
//		HttpSession session = request.getSession();
//		Object row = session.getAttribute("row");
//		System.out.println(row.toString());
		
		int result = 5; //초기화
		
		VideoRunDAO dao = new VideoRunDAO();
		result = dao.isRun();	// 	result : tb_video_run 조회한 결과 
//		response.getWriter().append(run ? "1" : "0").append("\r\n"); //멘토님이 써준 거
		if (result == 1) {
			
			System.out.println("result"+result);
		}else {
			System.out.println("예호~~~~~~"); // 값 못 받아왔을 경우
		}
		PrintWriter out = response.getWriter();
	    out.print(result); // tb_video_run 조회한 결과를 응답
		
		return null;
	}

}
