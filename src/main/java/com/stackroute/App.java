package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        //Using Application Context
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        Movie beanA = context.getBean("movieBean",Movie.class);
        System.out.println(beanA);
        Movie beanB = context.getBean("movieBean2",Movie.class);
        System.out.println(beanB);
    }
}
