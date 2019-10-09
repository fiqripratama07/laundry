package com.enigmacamp.servlet.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie
 */
@WebServlet(name = "/CookieServlet", urlPatterns = "/CookieServlet")
public class Cookieservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		//create cookie
		Cookie myCookie = new Cookie("cookieKey", "Cookie_Value");
		response.addCookie(myCookie);
		
		//get cookie
		Cookie reqCookies[] = request.getCookies();
		for (int i = 0; i < reqCookies.length; i++) {
			response.getWriter().print("<marquee direction= 'right'>" +reqCookies[i].getName()+ " : " + reqCookies[i].getValue() + "</marquee>");
			response.getWriter().print(reqCookies[i].getName()+ " : " + reqCookies[i].getValue() + "<br/>");
		}
	}

}
