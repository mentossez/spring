package com.learnspring.injections.referenceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferenceTypeApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("referencetypeConfig.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.getName());
        System.out.println(user.getLoginDetails().getUsername());
        System.out.println(user.getLoginDetails().getPassword());
    }
}
