package com.servlet.form;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("uname");
		System.out.println(req.getParameter("uname"));
		System.out.println(req.getParameter("pword"));
		req.getRequestDispatcher("loggedin.html").forward(req, resp);
	}
}
