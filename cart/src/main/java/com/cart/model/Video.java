package com.cart.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.cart.controller.Command;
import com.cart.controller.Qr;


public class Video extends Qr {
	private static final long serialVersionUID = 1L;
	

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  StringBuffer jb = new StringBuffer();
		  String line = null;
		 
		  try {
		    BufferedReader reader = request.getReader();
		    while ((line = reader.readLine()) != null)
		      jb.append(line);
		  } catch (Exception e) { /*report an error*/ }

		  try {
			  JSONParser parser = new JSONParser();
			  JSONObject jsonObject = (JSONObject) parser.parse(jb.toString());			 
			  System.out.println("값만 >> "+jsonObject.get("path"));
		  } catch (Exception e) {
		    // crash and burn
		    throw new IOException("Error parsing JSON request string");
		  }
		
		

		String data = request.getParameter("path");
		

		PrintWriter out = response.getWriter();
		out.print(row);
		    

		return null;
	}

}
