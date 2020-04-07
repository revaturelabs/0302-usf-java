package com.servlet.direct;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author Revature
 *
 *	what is a servlet?
 *		A servlet is a java class that extends the capabilities
 *			of a server.
 *
 *	to create a servlet there are a few steps.
 *		1. make a class that extends HttpServlet
 *		2. register it with tomcat. This can be done with:
 *			2a. web.xml
 *
 *
 *	Servlet Hierarchy
 *						Serializable (interface)
 *			ServletConfig (interface)		Servlet (interface)
 *										|
 *								GenericServlet (abstract class)
 *										|
 *								HttpServlet (abstract class)
 *										|
 *								our custom servlet (class)
 *
 */
public class FirstServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException {
		System.out.println("in the servlets doGet method");
	}

}
