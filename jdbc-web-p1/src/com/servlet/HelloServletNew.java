package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServletNew
 */
@WebServlet("/helloNew")
public class HelloServletNew extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public HelloServletNew() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String message = "I am running New DoGet !";
		Date date = new Date(System.currentTimeMillis());
		System.out.println(message + "----" + date);

		String e = request.getParameter("email");
		PrintWriter out = response.getWriter();
		out.print(message + " " + date);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("doPost");
		String e = request.getParameter("email");
		PrintWriter out = response.getWriter();
		out.print("Hello Psot " + e);
	}

}
