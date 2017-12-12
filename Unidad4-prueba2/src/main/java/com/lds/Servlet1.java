package com.lds;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String pr ="";
		Properties p = System.getProperties();
		Enumeration<Object> keys = p.keys();
		while (keys.hasMoreElements()) {
		    String key = (String)keys.nextElement();
		    String value = (String)p.get(key);
		    pr = pr + key + ": " + value + "<br>";
		}
		response.getWriter().println(pr);
		
	  String[] prop = System.getProperties().toString().split(",");
	  String resultado ="";
	  for (int i=0 ; i< prop.length ; i++) {
		  resultado = resultado + prop[i] + "<br>";
	  }
	  response.getWriter().print(resultado);
	}	

	
}
