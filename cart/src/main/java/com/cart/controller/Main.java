package com.cart.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.cart.model.QrDAO;

public class Main implements Command {
	private static final long serialVersionUID = 1L;
	

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		return "main.jsp"; 
	}

}
