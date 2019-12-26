package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //Using Application Context
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        Movie beanA = context.getBean("movieBean", Movie.class);
        Movie beanB = context.getBean("movieBean", Movie.class);
        System.out.println(beanA);
        System.out.println(beanB);
        System.out.println("BeanA == BeanB?? = " + (beanA == beanB));
        Movie beanC = context.getBean("movieBean2", Movie.class);
        System.out.println(beanC);
        
    }
}
