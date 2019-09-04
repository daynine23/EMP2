package com.isil.war.example;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.isil.ejb.example.EjbExampleLocal;

/**
 * Servlet implementation class ServletExample
 */
//@WebServlet("/servletExample")
public class ServletExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	@EJB
	private EjbExampleLocal ejbExampleLocal;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletExample() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("into doPost ... ..");
		int number1 = Integer.parseInt(request.getParameter("number1").toString());
		int number2 = Integer.parseInt(request.getParameter("number2").toString());
		request.setAttribute("sum", ejbExampleLocal.suma(number1, number2));
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		System.out.println("out doPost ...");
	}

}
