package com.example.bean;

public class BeanWayService {
    public void init() {
        System.out.println("BeanWayService-init()");
    }

    public BeanWayService() {
        System.out.println("BeanWayService-构造方法");
    }
    public void destroy() {
        System.out.println("BeanWayService-destroy()");
    }
}