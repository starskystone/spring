package com.xiaoleilei.spring3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Administrator xautwl17@gmail.com 2019/4/6 0006 17:23
 */
public class MainTest3 {

    public static void main(String[] args){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(MainConfig3.class);

        app.close();
    }


}
