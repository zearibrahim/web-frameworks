package com.example;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Converter")
public class Convertor extends Login{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Some binary data has been submitted");
		
		String user = request.getSession().getAttribute("CURRENT_USER").toString();
		
		System.out.println("Session data: " + user);
		
		String input = request.getParameter("bin-number");
		
		System.out.println("User data: " + input);
		
		//Insert normal/pure java logic to convert from binary to hex
		//......
		int result = 123456789;
		
		request.getSession().setAttribute("CONVERTER_RESULT", result);
		
		request.getRequestDispatcher("/WEB-INF/user-welcome.jsp").forward(request, response);
	}
}
