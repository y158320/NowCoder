package com.nowcoder.interview.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(annotationConfigApplicationContext.getBean(BeanTest.class));
    }

}
