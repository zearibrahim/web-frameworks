package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 /**Servlet implementation class MyServlet
 * Author : Zear Ibrahim
 * Usage  : A simple servlet example using the POST and GET methods
 */

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

	/**Class constructor
	 * You can insert logic here on what to do when someone connects to your server
	 * i.e upon creation of this class.
	 * @see HttpServlet#HttpServlet() 
	 */
	public Servlet() {
		super();
	}

	/**Data is 'POST'ed from the client HTTP pages to this method
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Process the clients form input here !!!

		//Get the HTML data
		String s_user = request.getParameter("uname");
		String s_pwd = request.getParameter("pwd");
		
		//Do something with the user input .....
		System.out.printf("Received " + s_user + " and " + s_pwd);
		//Respond to the users input/request after processing
		doGet(response);
	}

	/**Data is retrieved ('GET') from the server to the clients perspective
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response) 
	 */
	protected void doGet(HttpServletResponse response_to_send) throws ServletException, IOException {
		//Process the servers response to the client here !!!
		
		PrintWriter out = response_to_send.getWriter();
		out.println("Thank you :) ");	
	}
}
