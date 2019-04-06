package com.xiaoleilei.spring3;

import com.xiaoleilei.spring1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator xautwl17@gmail.com 2019/4/6 0006 17:19
 */

@Configuration
public class MainConfig3 {
    @Bean("person")
    public Person person() {
        return new Person("wanglei",22);
    }

    @Bean(value = "bike",initMethod = "init",destroyMethod = "destory")
    public Bike bike(){
        return new Bike();
    }
}
