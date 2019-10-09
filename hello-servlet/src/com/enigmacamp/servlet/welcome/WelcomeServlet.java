package com.enigmacamp.servlet.welcome;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * http://localhost:8080/hello-servlet/halo?name=Fiqri
 *download aplikasi postman 
 * @author EnigmaCamp
 *
 */

@WebServlet("/halo")
public class WelcomeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		String name = request.getParameter("name");
//		resp.getWriter().print("<marquee>Hello Worldwide Web, " + name + "!</marquee>");
		request.setAttribute("name", name);
		request.getRequestDispatcher("/WEB-INF/views/halo/index.jsp").forward(request, response);
	}
	
	
	
}
