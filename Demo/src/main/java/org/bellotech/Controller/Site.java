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

@WebServlet("/Site")
public class Site extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Site() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String page = request.getParameter("page").toLowerCase();
		switch (page) {

		case "listusers":
			listusers(request, response);
			break;

		case "addusers":
			addusers(request, response);
			break;

		case "updateuser":
			updateuser(request, response);
			break;
		case "deleteusers":
			new UserModel().deleteUser(Integer.parseInt(request.getParameter("user_id")));
			listusers(request, response);
			break;

		default:
			request.setAttribute("title", "ErrorPage");

			request.getRequestDispatcher("error.jsp").forward(request, response);
			break;

		}
	}

	protected void listusers(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<User> users = new ArrayList<>();
		users = new UserModel().listuser();
		request.setAttribute("listusers", users);
		request.setAttribute("title", "project");
		request.getRequestDispatcher("listusers.jsp").forward(request, response);
	}

	protected void addusers(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setAttribute("title", "addproject");
		request.getRequestDispatcher("addusers.jsp").forward(request, response);
	}

	protected void updateuser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setAttribute("title", "update");
		request.getRequestDispatcher("updateuser.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String form = request.getParameter("form").toLowerCase();
		switch (form) {

		case "adduseroperation":
			User user = new User(request.getParameter("username"), request.getParameter("projectName"),
					request.getParameter("project"));
			new UserModel().addUser(user);
			break;
		case "updateuseroperation":
			User update_user = new User(Integer.parseInt(request.getParameter("user_id")),
					request.getParameter("username"), request.getParameter("projectName"),
					request.getParameter("project"));

			new UserModel().addUser(update_user);
			break;
			
		case "deleteuseroperation":
			
			
			break;

		}

	}
}
