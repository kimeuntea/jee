package com.homepage.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.homepage.web.serviceImpl.KaupImpl;
import com.homepage.web.services.KaupInterface;
/*
@ Date :  somedate;
@ Autor : ;
@ Stroy : 키와 몸무게가 입력되면  카우푸 지수와 메시지를  웹브라우저에 랜더링 ; 

*/@WebServlet("/kaup.do")
public class KaupController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public KaupController() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("1");
		request.setCharacterEncoding("UTF-8");
		KaupInterface interface1 = new KaupImpl();
		
		double height= Double.parseDouble(request.getParameter("height")); 
		double weight= Double.parseDouble(request.getParameter("weight"));		
			request.setAttribute("height", height);
		    request.setAttribute("weight", weight);
		
	 interface1.getKaupIndex
			(height,weight );
	
	request.setAttribute("msg", interface1.getRsultMsg());
	
	RequestDispatcher dispatcher =request.getRequestDispatcher("/views/model2/kaup.jsp");
	dispatcher.forward(request, response);
	
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
