package com.example.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        DemoBean bean = context.getBean(DemoBean.class);
        bean.output();
        context.close();
    }
}