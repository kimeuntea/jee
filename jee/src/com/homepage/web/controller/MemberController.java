package com.homepage.web.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.homepage.web.beans.MemberBean;
import com.homepage.web.serviceImpl.MemberServiceImpl;
import com.homepage.web.services.MemberService;

/*
 * @ Date : someday
 @Author : 
 회원가입과 로그인 담당하는 컨트롤러
*/
@WebServlet({"/login.do","/join.do"})
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    HashMap<String, String>map = new HashMap<String, String>();
	MemberBean bean = new MemberBean();
    MemberService service = new MemberServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String path=request.getServletPath();
		System.out.println(path);
		
		
		String url ="";
		int result=0;
		switch (path) {
		case "/join.do":
			
			String id= request.getParameter("id");
			String pass= request.getParameter("pass");
			String name= request.getParameter("name");
			int age= Integer.parseInt(request.getParameter("age"));
			String address= request.getParameter("address");
		    
			map.put("id", id);
			map.put("pass", pass);
			map.put("name", name);
			map.put("age", (request.getParameter("age")));
			map.put("address", address);
			
			service.join(id, pass, name, age, address);
	
			url ="views/model2/memberForm.jsp";
			break;
        case "/login.do":
        	request.setAttribute("id", map.get("id"));
        	request.setAttribute("pass", map.get("pass"));
        	request.setAttribute("name", map.get("name"));
        	request.setAttribute("age", map.get("age"));
        	request.setAttribute("address", map.get("address"));
			result=service.login((String)request.getParameter("id"),(String)request.getParameter("pass"));
			if(result==1){
				url="/views/model2/loginFail.jsp";
				request.setAttribute("msg", "아이디가 틀림");
			}else if(result==2){
				url="/views/model2/loginFail.jsp";
				request.setAttribute("msg", "비번이틀림");
			}else{
				url="/views/model2/member.jsp";
			}
			break;
		default:
			break;
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
