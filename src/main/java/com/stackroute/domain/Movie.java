package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    private Actor actor;
    private BeanFactory factory;
    private ApplicationContext context;

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public Movie() {
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {

        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
        System.out.println("Application Context : " + applicationContext);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.factory = beanFactory;
        System.out.println("Bean factory : " + beanFactory);
    }

    @Override
    public void setBeanName(String string) {
        System.out.println("Bean Name : " + string);
    }
}
