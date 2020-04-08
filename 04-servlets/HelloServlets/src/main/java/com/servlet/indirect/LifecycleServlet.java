package com.servlet.indirect;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author Revature
 *
 *the lifecycle of a servlet consists of:
 *		init, service, destroy
 *Tomcat will call each of these:
 *		init()		:		once
 *		service()	:		n number of time
 *		destroy()	:		once
 */
public class LifecycleServlet extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
		System.out.println("in the init");
		super.init();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("in the service");
		System.out.println(getInitParameter("first-param"));
		System.out.println(getServletContext().getInitParameter("contextual param"));
		super.service(req, resp);
	}
	
	@Override
	public void destroy() {
		System.out.println("in the destroy");
		super.destroy();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("get");
	}
	

}
