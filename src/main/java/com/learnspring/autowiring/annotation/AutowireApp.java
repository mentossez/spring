package com.learnspring.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireUsingAnnotationConfig.xml");

        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
    }
}
