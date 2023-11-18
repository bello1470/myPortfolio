package org.bellotech.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bellotech.Entity.User;
import org.bellotech.model.UserModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Home() {
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String page = request.getParameter("page").toLowerCase();
		
		switch (page) {
		case "home":
			request.setAttribute("title", "Homepage");
			request.getRequestDispatcher("index.jsp").forward(request, response);
			break;

		default:
			request.setAttribute("title", "ErrorPage");
			request.getRequestDispatcher("error.jsp").forward(request, response);
			break;

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
