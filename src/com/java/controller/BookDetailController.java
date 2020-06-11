package com.java.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.daoImpl.BookDetailDAOImpl;
import com.java.model.BookDetails;

/**
 * Servlet implementation class BookDetailController
 */
@WebServlet("/BookDetailController")
public class BookDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BookDetailController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	BookDetailDAOImpl bookDetailDaoImpl;
	BookDetails bookDetails;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		bookDetails = new BookDetails();
		bookDetailDaoImpl = new BookDetailDAOImpl();
		int bookDetailsId = bookDetails.getBookDetailsId();
		int bookId = 100;// bookDetails.getBookDetailsId();
		String bookName = request.getParameter("bookName");
		String studentName = request.getParameter("bookStudentName");
		String studentClass = request.getParameter("bookStudentClass");
		String dateOfIssue = request.getParameter("datePickerControl");

		bookDetails.setBookDetailsId(bookDetailsId);
		bookDetails.setBookId(bookId);
		bookDetails.setBookName(bookName);
		bookDetails.setStudentName(studentName);
		bookDetails.setStudentClass(studentClass);
		bookDetails.setDateOfIssue(dateOfIssue);
		bookDetailDaoImpl.insertAllBookDetail(bookDetails);

	}

}
