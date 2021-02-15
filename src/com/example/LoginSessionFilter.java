package com.example;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

/***
 * @author Zear
 * This class prevents the browser from caching login pages.
 * This prevents the user from using 'back' and 'forward' buttons
 * to re-visit the login page after the session-cookie has expired.
 */

@WebFilter
public class LoginSessionFilter implements Filter {

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		
		/*
		 * To prevent the users from re-visiting the logged in pages after the session has expired,
		 * we need to instruct the browser to not cache all the restricted JSP page.
		 * 
		 * To do so: 
		 * 1) In this class we must set the response header to 'no-cache', 'no-store', 'must-revalidate'.
		 * 2) We also have to make use of the web.xml file under the WEB-INF folder to register this class.
		 * 3) Once registered in the web.xml file, in that same file we must provide a url-pattern
		 * that we consider restricted. For example all *.jsp files. 
		 * 
		 * HINT: https://stackoverflow.com/questions/4194207/prevent-user-from-seeing-previously-visited-secured-page-after-logout
		 */		
	}
}
