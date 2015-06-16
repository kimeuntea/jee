package com.homepage.web.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import com.homepage.web.beans.MemberBean;
import com.homepage.web.services.MemberService;

public class MemberServiceImpl implements MemberService{
	
	MemberBean bean = new MemberBean();
	Map<String,Object> map = new HashMap<String,Object>();
	
	@Override
	public void join(String id, String password, String name, int age,
			String addr) {
		
		bean.setAddr(addr);
		bean.setAge(age);
		bean.setId(id);
		bean.setName(name);
		bean.setPassword(password);
		
		map.put("id", bean.getId());
		map.put("password", bean.getPassword());
		map.put("name", bean.getName());
		
		
		map.put("age", String.valueOf(bean.getAge()));
		map.put("addr", bean.getAddr());
		
		
	}
	
	@Override
	public int login(String id, String password) {
		System.out.println(map.get("id"));
		if(map.get("id").equals(id)&& map.get("password").equals(password)){
			return 3;
		}else if(!((map.get("id").equals(id))&&map.get("password").equals(password))){
			return 1;
		}else{
			return 2;
		}
		
	}

}
