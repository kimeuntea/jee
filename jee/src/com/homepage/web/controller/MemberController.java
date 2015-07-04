package com.homepage.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
@WebServlet({"/login.do","/join.do","/member/searchIdForm.do","/member/searchPassForm.do",
	"/member/searchAllMembers.do"})
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    HashMap<String, String>map = new HashMap<String, String>();
	MemberBean bean = new MemberBean();
    MemberService service =MemberServiceImpl.getInstance();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String path=request.getServletPath();
		String url="";
		switch (path) {
		  case "/member/searchIdForm.do":
	        	System.out.println("1");
	        	url="/views/model2/searchIdForm.jsp";
	        	break;
	        case "/member/searchPassForm.do":
	        	url="/views/model2/searchPassForm.jsp";
	        	break;
	        case "/member/searchAllMembers.do":
	        	List<MemberBean>list = new ArrayList<MemberBean>();
	        	list = service.getList();
	        	request.setAttribute("memberlist",list);
	        	url="/views/model2/searchAllMembers.jsp";
	        	break;
		default:
			break;
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String path=request.getServletPath();
		System.out.println(path);
		
		
		String url ="";
		int result=0;
		String joinmsg = null;
		switch (path) {
		case "/join.do":
			
			String id= request.getParameter("id");
			String pass= request.getParameter("pass");
			String name= request.getParameter("name");
			String age= request.getParameter("age");
			String email= request.getParameter("email");
		    bean.setId(id);
		    bean.setName(name);
		    bean.setAge(age);
		    bean.setEmail(email);
		    bean.setPassword(pass);
			
			map.put("id", id);
			map.put("pass", pass);
			map.put("name", name);
			map.put("age", (request.getParameter("age")));
			map.put("email", email);
			
			result=service.join(bean);
			if(result !=0){
				joinmsg=name+"회원가입";
			}else{
				
				joinmsg="회원가입실패";
			}
			request.setAttribute("msg", joinmsg);
	        url ="views/model2/main.jsp";
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
