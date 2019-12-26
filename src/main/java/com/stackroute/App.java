package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //Using XmlBeanFactory
        ClassPathResource resources = new ClassPathResource("beans.xml");
        XmlBeanFactory factory = new XmlBeanFactory(resources);
        Movie movie = factory.getBean("movieBean", Movie.class);
        System.out.println(movie);

        //Using Application Context
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1 = context.getBean("movieBean", Movie.class);
        System.out.println(movie1);

        //Using Spring 3.2 BeanDefinitionRegistry and BeanDefinitionReader
        BeanDefinitionRegistry registry = new XmlBeanFactory(resources);
        BeanDefinitionReader reader = new XmlBeanDefinitionReader(registry);
        BeanFactory factory1 = (BeanFactory) reader.getRegistry();
        Movie movie2 = factory1.getBean("movieBean", Movie.class);
        System.out.println(movie2);

    }
}
