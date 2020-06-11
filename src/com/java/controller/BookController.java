package com.java.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.daoImpl.BookDAOImpl;
import com.java.daoImpl.StudentDAOImpl;
import com.java.model.Book;
import com.java.model.Student;

/**
 * Servlet implementation class BookController
 */
@WebServlet("/showBook")
public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    BookDAOImpl bookDao;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try{
			bookDao=new BookDAOImpl();
			List<Book> allBooks=bookDao.getAllBooks();
			System.out.println("books are "+allBooks);
			RequestDispatcher rd=request.getRequestDispatcher("addressShowing.jsp");
			request.setAttribute("allBooks",allBooks);
			rd.forward(request, response);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	StudentDAOImpl studentDao;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
//		studentDao=new StudentDAOImpl();
//		List<Student> allStudent=studentDao.getAllStudents();
//		RequestDispatcher rd=request.getRequestDispatcher("addressShowing.jsp");
//		request.setAttribute("allStudents", allStudent);
//		rd.forward(request, response);
	}

}
