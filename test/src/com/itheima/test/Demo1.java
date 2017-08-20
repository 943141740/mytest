package com.itheima.test;

import javax.xml.ws.Endpoint;

import com.itheima.service.HelloService;
import com.itheima.service.impl.HelloServiceImpl;

/**
 * 发布webservice服务端的程序
 * @author Administrator
 *
 */
public class Demo1 {
	public static void main(String[] args) {
		//1.创建服务类对象
		HelloService helloService = new HelloServiceImpl();
		/**
		 * 参数一:代表发布到哪个地址(客户端使用哪个地址来访问这个服务)
		 * 		注意:如果客户端是本地的,那么地址写localhost,
		 * 			如果客户端是远程的,那么地址写对外的IP地址
		 * 参数二:服务类对象
		 */
		Endpoint.publish("http://localhost:8090/helloService", helloService);
		System.out.println("发布成功......");
		System.out.println("==============");
	}
}
