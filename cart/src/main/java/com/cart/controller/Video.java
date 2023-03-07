package com.cart.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cart.model.VideoDAO;
import com.cart.model.VideoDTO;

public class Video implements Command {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		VideoDAO dao = new VideoDAO();
		List<VideoDTO> list =  dao.selectVideo();
		if(list != null) {
			request.setAttribute("videolist", list);
			return "video.jsp";
		} else {
			return "main.jsp";
		}
	}

}
