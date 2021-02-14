package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class Login extends HttpServlet {

	//TODO: Get username + password from csv/txt/data storage
	private final String username = "admin";
	private final String password = "123";

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		//Get request parameters for username and password
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");

		if (this.username.equals(uname) && this.password.equals(pwd)) {
			request.getSession().setAttribute("CURRENT_USER", this.username); //Add variable to session cookie
			request.getSession().setMaxInactiveInterval(10); //Session cookie becomes invalid after 10s
			
			//Forward to welcome page
			//QUESTION: Why do you think this is under WEB-INF?
			request.getRequestDispatcher("/WEB-INF/user-welcome.jsp").forward(request, response);
		} else {
			request.setAttribute("error", "Wrong username or password");
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
	}
} 
