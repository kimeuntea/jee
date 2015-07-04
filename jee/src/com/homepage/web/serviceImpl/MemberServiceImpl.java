package com.homepage.web.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.homepage.web.beans.MemberBean;
import com.homepage.web.daos.MemberDao;
import com.homepage.web.services.MemberService;

public class MemberServiceImpl implements MemberService{
	
	/*
	DAO 가 싱글톤 패턴으로 단 하나의 인스턴스만 리턴한다면
	그것을 사용하는 서비스도 싱글톤으로 구성해야한다.
	그러지 않으면 다중 접속 상태에서 하나의 인스턴스만 사용하게 되어
	접속불량 현상이 발생한다. 
	*/
	private static MemberServiceImpl service = new MemberServiceImpl();
	private MemberServiceImpl(){}
	public static MemberServiceImpl getInstance(){
		return service;
	}
	MemberBean bean = new MemberBean();
	Map<String,Object> map = new HashMap<String,Object>();
	
	@Override
	
	public int join(MemberBean bean){
		return MemberDao.getInstance().join(bean);
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

	@Override
	public List<MemberBean> getList() {
		MemberDao dao = MemberDao.getInstance();
		return dao.getList();
	}

}
