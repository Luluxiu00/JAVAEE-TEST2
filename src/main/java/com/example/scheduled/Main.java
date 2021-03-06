package com.example.scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final SimpleDateFormat FORMAT = new SimpleDateFormat("HH:mm:ss");

    @SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        ScheduledTaskService bean = context.getBean(ScheduledTaskService.class);
        System.out.println("当前时间:"+FORMAT.format(new Date()));
    }
}