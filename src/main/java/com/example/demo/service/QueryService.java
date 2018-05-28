package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class QueryService {
	
	private boolean flag=false;
	private int i=0,j=0;
	
	public String Query(String name,List<String> name3,List<String> name1) {
		for (String string : name1) {
			if(!name.equals(string)) {
				j++;
			}
		}
		if(name1.size()==j) {
			System.out.println(name+"不是本班同学");
			flag=false;
		}else {
			flag=true;
		}
		while(flag) {
			for (String string : name3) {
				if(name.equals(string)) {
					System.out.println(name+"已签到");
					break;
				}else {
					i++;
					
				}
			}
			if(name3.size()==i) {
				System.out.println(name+"未签到");
			}
			return name;
		}
		return null;
	}

}
