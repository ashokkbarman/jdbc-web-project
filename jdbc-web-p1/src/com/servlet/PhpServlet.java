package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JavaServlet
 */
@WebServlet(urlPatterns = { "/php" }, initParams = { @WebInitParam(name = "trainerName", value = "Sia"),
		@WebInitParam(name = "phoneNo", value = "321") })
public class PhpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PhpServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/HTML");

		String name = request.getParameter("name");
		PrintWriter out = response.getWriter();
		out.print("Hello, PHP " + name);
		out.print("<br />");

		ServletConfig cfg = getServletConfig();
		String tName = cfg.getInitParameter("trainerName");
		String mNo = cfg.getInitParameter("phoneNo");

		out.print("Your trainer is " + tName + " and his mobile number is " + mNo);
		out.print("<br />");

		ServletContext ctx = cfg.getServletContext();
		String institute = ctx.getInitParameter("institute");
		out.print(institute);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
