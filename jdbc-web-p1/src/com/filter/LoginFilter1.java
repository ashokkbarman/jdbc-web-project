package com.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/login")
public class LoginFilter1 implements Filter {

	public LoginFilter1() {

	}

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		// pre-processing
		System.out.println("LoginFilter1 pre-processing");

		String email = request.getParameter("email");

		if (email != null && email.equalsIgnoreCase("akb@a.com")) {

			String emails = request.getParameter("email");
			PrintWriter out = response.getWriter();
			out.print("Hello :" + emails + " , You are blocked!!!");
			System.out.println("Yor are blocked");
		} else {
			// pass the request along the filter chain
			chain.doFilter(request, response);
		}

		// post-processing
		System.out.println("LoginFilter1 post-processing");
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
