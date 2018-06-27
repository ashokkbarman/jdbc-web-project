package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Old style Not using @WebServlet using web.xml
 *
 */

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String message = "I am running !";
		Date date = new Date(System.currentTimeMillis());
		System.out.println(message + "----" + date);

		String e = req.getParameter("email");
		PrintWriter out = resp.getWriter();
		out.print(message + " " + date);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost");
		String e = req.getParameter("email");
		PrintWriter out = resp.getWriter();
		out.print("Hello " + e);
	}

}
