package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import com.example.demo.service.CountService;
import com.example.demo.service.QueryService;
import com.example.demo.service.SignClassService;

@Controller
@SpringBootApplication
public class TakeClassController {

	@Bean
	public String qiandao() {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		
		list.add("王浩宇");
		list.add("何世超");
		list.add("刘伟");
		list.add("王涛");
		list.add("李详");
		Scanner scanner=new Scanner(System.in);
		List<String> name2=new ArrayList<>();
		while(true) {
			System.out.println("请输入签到姓名：");
			String name4=scanner.next();
			SignClassService sc=new SignClassService();
			String name3=sc.SignIn(name4, list,name2);
			if(name3!=null) {
				name2.add(name3);
			}
			System.out.println("是否继续签到? yes/no");
			String what=scanner.next();
			if(what.equals("no")) {
				break;
			}
		}
		while(true) {
			System.out.println("请输入要查询的学生姓名：");
			String name5=scanner.next();
			QueryService query=new QueryService();
//			for (String string : names) {
//				System.out.print("name: "+string);
//			}
//			System.out.println();
			if(query.Query(name5, name2,list)==null) {
				System.out.println("是否继续查询? yes/no");
			}else{
				break;
			}
			String what=scanner.next();
			if(what.equals("no")) {
				break;
			}
			
		}
		
		CountService conunt=new CountService();
		conunt.count(list, name2);
		return null;
    }
}
