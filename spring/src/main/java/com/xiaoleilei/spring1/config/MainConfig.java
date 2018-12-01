/**
 * 
 */
package com.xiaoleilei.spring1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xiaoleilei.spring1.Person;

/**
 * @author Administrator
 *
 */
@Configuration
public class MainConfig {
	
	@Bean("person")
	public Person person() {
		return new Person("wanglei",22);
	}

	@Bean("person2")
	public Person person2() {
		return new Person("wanglei",22);
	}
}
