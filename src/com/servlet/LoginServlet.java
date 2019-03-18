package com.servlet;

import java.io.IOException;


import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.servlet.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		User user=new User();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		user.setPassword(password);
		user.setUsername(username);
		UserDao userDao=new UserDao();
		try{
			user=userDao.query(username);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		if(user==null){
			request.getRequestDispatcher("register.jsp").forward(request,response);
		}
		else{
			if((user.getUsername().equals(username))&&(user.getPassword().equals(password))){
				request.getRequestDispatcher("login_success.jsp").forward(request, response);
			}
			else{
				request.getRequestDispatcher("login_failure.jsp").forward(request, response);
			}
		}
	}

}
