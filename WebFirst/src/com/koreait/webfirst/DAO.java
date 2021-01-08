package com.koreait.webfirst;

import java.util.ArrayList;
import java.util.List;

public class DAO {
	public static List<CityEntity> selCityList() {
		List<CityEntity> list = new ArrayList<>();
		
		CityEntity vo = new CityEntity();
		vo.setID(1);
		vo.setName("Korea");
		list.add(vo);
		
		vo = new CityEntity();
		vo.setID(2);
		vo.setName("USA");
		list.add(vo);
		
		return list;
	}
}
