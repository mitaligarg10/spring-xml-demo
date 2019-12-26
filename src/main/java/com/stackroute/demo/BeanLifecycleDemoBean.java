package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init method after properties are set! Kindly Check!!!!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Ohhh!!! Spring Container Destroyed ;( ");
    }

    public void customInit() {
        System.out.println("Custom Init For Spring");
    }

    public void customDestroy() {
        System.out.println("Custom Destroy For Spring");
    }
}
