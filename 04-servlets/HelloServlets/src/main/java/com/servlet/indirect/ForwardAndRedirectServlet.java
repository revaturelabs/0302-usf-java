package com.servlet.indirect;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author Revature
 *
 *	there are three ways that a servlet can respond to an incoming http request
 *		direct
 *			this happens when the servlet doesnt need anymore help
 *			we use the printWriter Object from response.getWriter()
 *		forward
 *			2 requests, 2 responses. uses the response objects sendRedirect()
 *				method to operate
 *		redirect
 *			1 request, 	1 response. Uses RequestDispatcher's forward method
 *				from the HttpServletRequest object.
 *
 */

public class ForwardAndRedirectServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("http://duckduckgo.com");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("/direct");
		rd.forward(req, resp);
	}
	
	
}
