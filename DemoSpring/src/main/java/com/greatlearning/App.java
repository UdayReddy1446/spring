package com.greatlearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("web.xml");
       Student s=(Student)context.getBean("studentBean");
       Student s1=(Student)context.getBean("studentBean1");
       System.out.println(s);
       System.out.println(s1);
    }
}
