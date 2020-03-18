package com.perscholas.springboot_basic_web.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuthenticationFilter implements Filter {
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		/* The "doFilter" method only accepts an argument of ServletRequest type so we must 
		 * cast this to HttpServletRequest to access the HttpSession instance.  */
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		/* Here we check to see if a user is logged in. If this is true then the HTTP request 
		 * proceeds as normal to the specified URL. */
		if (session.getAttribute("currentUser") != null) {
			System.out.println(req.getServletPath() + ": Valid authentication.");
			chain.doFilter(request, response);
		} else {
			/* If the request gets filtered (i.e., the user is not logged in) then the user 
			 * is directed to the base URL which is the login page.  */
			System.out.println(req.getServletPath() + ": Invalid authentication. User not logged in.");
			RequestDispatcher rd = request.getRequestDispatcher("/");
			HttpServletResponse resp = (HttpServletResponse) response;
			rd.forward(req, resp);
		}
	}

}
