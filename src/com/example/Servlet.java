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
	private static final long serialVersionUID = 1;

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
		boolean successful = false;

		//Do something with the user input .....
		String s_UserName = request.getParameter("s_UserName");
		String s_Password = request.getParameter("s_Password");
		
		if(s_UserName == "Zear" &&s_Password == "Friday"){
			successful = true;
		}
		
		String s_FullName = s_UserName + " "+ s_Password;
		System.out.println(s_FullName);
		
		//Respond to the users input/request after processing
		doGet(request, response,successful);
	}

	/**Data is retrieved ('GET') from the server to the clients perspective
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response) 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response, boolean success) throws ServletException, IOException {
		//Process the servers response to the client here !!!
		
		PrintWriter out = response.getWriter();
		if (success == true){
		 out.println("Thank you :) ");	
		}
		else{
			 out.println("Nope !");	
		}
	}
}
