package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CountService {
	
	public int count(List<String> list1,List<String> list2) {
		System.out.println("已签到人数："+list2.size());
		System.out.println("未签到人数："+(list1.size()-list2.size()));
		System.out.println("总人数："+list1.size());
		return list1.size()-list2.size();
		
	}

}
