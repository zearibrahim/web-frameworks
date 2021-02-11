package com.example;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

@WebServlet("/Login")
public class Login extends HttpServlet {  

	private final String welcome_page = "welcome.jsp";
	private String input_uname = "";
	private String input_pwd = "";
	private String result = "";
	private final String SPECIAL_NAME = "SPECIAL-COOKIE";
	private final String folder = "data";
	/***
	 * Receive Post request from client
	 * @throws IOException 
	 * @throws ServletException 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {  

		//Get HTML form data
		input_uname = request.getParameter("name");  
		input_pwd = request.getParameter("pwd");  
		
		//Perform login procedure.
		if(login(request, response,input_uname))
		{
			//Redirect user to welcome page if they logged in successfully
			response.sendRedirect(request.getContextPath() + "/" + welcome_page);
		}
	}

	//Check if this login exists, and set cookie if it does
	private boolean login (HttpServletRequest request, HttpServletResponse response, String uname){

		/*
		 * TODO: Read uname from directory of txt/csv file to see if this is a valid user
		 * If it does not we add a new cookie and unique txt file
		 * 
		 * If it does, we read the data from that txt file and load the welcome page with it.
		 */

		Cookie[] c = request.getCookies();
		boolean result = false;

		for(int i=0;i<c.length;i++){  
			System.out.println("Name: " + c[i].getName() +" & Value: "+ c[i].getValue());

			//Check if the user has a special cookie for our domain
			if(!c[i].getName().equals(SPECIAL_NAME)){

				//Create a new cookie, set it's max alive time, and add it to the response.
				Cookie cc = new Cookie(SPECIAL_NAME, input_uname);
				cc.setMaxAge(60);//TODO: if cookie runs out of time - prevent user from accessing welcome page.
				cc.setValue(input_uname);
				response.addCookie(cc);
				result = true;
			}			
		}	
		return result;
	}
}