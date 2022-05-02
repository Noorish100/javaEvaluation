package com.masai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mobile {
	
	public String addMobile(String company,String model) {
		
		Map<String,ArrayList<String>> mob=new HashMap<>();
		List<String> list=new ArrayList<>();
		list.add(model);
		
		mob.put(company,(ArrayList<String>) list );
		
		
		
		
		return company;
		
		
		
	}
	
	public List<String> getModels(String Company){
		List<String> l1=new ArrayList<>();
		
		l1.add(Company);
		return l1;
		
	}
	

}
