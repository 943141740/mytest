package com.itheima.service.impl;

import javax.jws.WebService;

import com.itheima.service.HelloService;
@WebService  //代表把该类变为webservice的服务类
public class HelloServiceImpl implements HelloService{

	@Override
	public String sayHello(String name) {
		
		return "Hello,"+name;
	}

}
