package com.homepage.web.serviceImpl;

import com.homepage.web.beans.KaupVO;
import com.homepage.web.services.KaupInterface;

public class KaupImpl implements KaupInterface {

	KaupVO vo = new KaupVO();

	@Override
	public int getKaupIndex(double height, double weight) {
		// TODO Auto-generated method stub
		vo.setHeight(height);
		vo.setWeight(weight);
		return (int) (((vo.getWeight() / (vo.getHeight() * vo.getHeight())) * 10000));
	}

	@Override
	public String getRsultMsg() {
		String msg = "";
		int idx = getKaupIndex(vo.getHeight(), vo.getWeight());
		if (idx > 30) {
			msg = "비만";
		} else if (idx > 24) {
			msg = "과체중";
		} else if (idx > 20) {
			msg = "정상";
		} else if (idx > 15) {
			msg = "저체중";
		} else if (idx > 13) {
			msg = "마름";
		} else if (idx > 10) {
			msg = "영양실조";
		} else {
			msg = "소모증";
		}     
        
		return msg;
	}


}
