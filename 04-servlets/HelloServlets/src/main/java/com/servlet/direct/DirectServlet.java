package com.servlet.direct;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.model.Cat;

/**
 * 
 * @author Revature
 *
 *	http request methods
 *		get, post, put, delete, patch, head, options, etc...
 *
 *	when you make these requests they correspond to crud methods
 *		get = read
 *		post = create
 *		put = update
 *		delete = delete
 *		patch = update
 */
public class DirectServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
		
//		resp.setContentType("text/html");
//		resp.getWriter().println("<html><body><h1>The "+
//		"servlet is responding</h1></body></html>");
		resp.setContentType("application/json");
		resp.getWriter().println(new Cat(1, "fixit felix jr", false));
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/json");
		resp.getWriter().println(new Cat(1, "fixit felix jr", false));
	}
}
