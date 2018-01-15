package com.example.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        AwareService bean = context.getBean(AwareService.class);
        bean.output();
        context.close();
    }
}