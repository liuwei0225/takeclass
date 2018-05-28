package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SignClassService {
	
	private boolean flag = false;
	private int i ,j ;
	
	public String SignIn(String name,List<String> name1,List<String> name2) {
		if(name2!=null) {
			for (String string : name2) {
				if(name.equals(string)) {
					System.out.println("您已签过到，无须再签");
					flag=false;
				}else {
					j++;
				}
			}
			if(name2.size()==j) {
				flag=true;
			}
		}
		while(flag) {
			for (String string : name1) {
				if(name.equals(string)) {
					System.out.println("签到成功");				
					return name;
				}else{
					i++;
					
				}
			}
			if(name1.size()==i) {
				System.out.println("您不是本班学生");
			}
			return null;
		}
		return null;
	}

}
