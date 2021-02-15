package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/***
 * @author Zear
 * This is a simple class to perform string comparison on a local file.
 * This is not a proper authenticator and does not make use of encrypted tokens.
 */
@SuppressWarnings("serial")
public class Authenticator{
	private String uname = null;
	private String pwd = null;
	private String stored_username = null;
	private String stored_password = null;

	//Constructor
	Authenticator (String uname, String pwd) throws IOException{
		this.uname = uname;
		this.pwd = pwd;
	}

	// TODO: In assignment 2.2 discuss authentication tokens with the idea that
	// plain text comparison is not secure.
	public boolean authenticateUser() throws IOException{	
		return readUserFile() ? true : false;
	}

	/*
	 * NOTE: This is a simple persistent data storage facility.
	 * It is not a proper data source such as a database
	 * 
	 * TODO: In Assignment 2.2, discuss the benefit of using proper data sources such as MySQL and NoSQL
	 * 
	 * TODO: Replace with logic to read file name based on username
	 */
	private boolean readUserFile() throws IOException{
		boolean status = false;
		File f = new File("/Users/Zear/Desktop/Data/user.txt");

		if(f.exists()){
			//TODO: Replace with actual data from username password file
			this.stored_username = "admin";
			this.stored_password = "123";
			
			if(uname.equals(this.stored_username) && pwd.equals(this.stored_password)){
				status = true;
			}
		}
		return status;
	}

	public String getAuthenticationMessage(){
		return "Username or password is incorrect";
	}

	public String getUsername(){
		return this.stored_username;
	}
}
