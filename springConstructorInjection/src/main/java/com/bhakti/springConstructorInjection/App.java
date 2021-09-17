package com.bhakti.springConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    ApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");
    
    Demo obj = (Demo)context.getBean("demo");
    
    System.out.println(obj);
}
