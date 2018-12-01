package com.xiaoleilei.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest1 {
	public static void main(String[] args) {
		//bean.xml 加载到容器
		ApplicationContext app = new ClassPathXmlApplicationContext("bean.xml");
		
		//获取bean
		Person person = (Person) app.getBean("person");
		
		System.out.println(person.toString());
	}
	
}
