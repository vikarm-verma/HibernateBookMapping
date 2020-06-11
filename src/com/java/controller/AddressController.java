package com.java.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.dao.AddressDao;
import com.java.daoImpl.AddressDAOImpl;
import com.java.model.Address;

//@WebServlet("/showAddress")
public class AddressController extends HttpServlet {
public AddressController()
{
	System.out.println("showing address ");
}
AddressDao addressDao;
protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	// TODO Auto-generated method stub
//	response.getWriter().append("Served at: ").append(request.getContextPath());
	System.out.println("this is working");
	
		try{
			addressDao=new AddressDAOImpl();
			List<Address> allAddress=addressDao.getAllAddress();
			RequestDispatcher rd=request.getRequestDispatcher("addressShowing.jsp");
			request.setAttribute("allAddress", allAddress);
			rd.forward(request, response);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
}
}
