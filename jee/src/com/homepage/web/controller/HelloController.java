package com.homepage.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.homepage.web.serviceImpl.HelloServiceImpl;
import com.homepage.web.services.HelloService;

@WebServlet({"/hello.do","/hi.do"})
public class HelloController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		HelloService helloService =new HelloServiceImpl();
		String msg=helloService.greet();
		
		String name =request.getParameter("name");
		if (request.getServletPath().equalsIgnoreCase("/hello.do")) {
			goHello(request, response, msg, name);
		}else if(request.getServletPath().equalsIgnoreCase("/hi.do")){
			goHi(request, response, name);
		}
        
      switch (request.getServletPath()) {
	case "/hello.do":
		goHello(request, response, msg, name);
		break;
    case "/hi.do":
    	goHi(request, response, name);
	default:
		break;
	}
       
       
       
	}

	private void goHi(HttpServletRequest request, HttpServletResponse response,
			String name) throws ServletException, IOException {
		request.setAttribute("result", name);
		RequestDispatcher dispatcher = 
				   request.getRequestDispatcher("/views/model2/hi.jsp");
		   dispatcher.forward(request, response);
	}

	private void goHello(HttpServletRequest request,
			HttpServletResponse response, String msg, String name)
			throws ServletException, IOException {
		name += msg;
		request.setAttribute("result", name);
		RequestDispatcher dispatcher = 
				   request.getRequestDispatcher("/views/model2/hello.jsp");
		   dispatcher.forward(request, response);
	}
}