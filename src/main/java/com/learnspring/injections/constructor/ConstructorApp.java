package com.learnspring.injections.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorConfig.xml");
        User user = (User) context.getBean("user");
        System.out.println("-------------------------------------------------\n");
        System.out.println(user.getPartyId());
        System.out.println(user.getUserRights().getUserRolesList());

        // Ambiguity problem
        System.out.println("\n-------------------------------------------------");
        Addition addition = (Addition) context.getBean("addition");
        addition.doSum();
    }
}
