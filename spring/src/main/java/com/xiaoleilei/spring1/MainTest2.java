/**
 * 
 */
package com.xiaoleilei.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.xiaoleilei.spring1.config.MainConfig;

/**
 * @author Administrator
 *
 */
public class MainTest2 {
	public static void main(String[] args) {
		//bean.xml加载到容器中
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		
		//注解注入到容器
		ApplicationContext app = new AnnotationConfigApplicationContext(MainConfig.class);
		
		Person person = (Person)app.getBean("person");
		System.out.println(person);
		
		String[] nameForBean = app.getBeanNamesForType(Person.class);
		for(String name: nameForBean) {
			System.out.println(name);
		}
		
	}
	
}
