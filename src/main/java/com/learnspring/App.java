package com.learnspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Welcome to Spring Learning!");
        ApplicationContext context = new ClassPathXmlApplicationContext("userConfig.xml");
        User user1 = (User) context.getBean("user1");
        User user2 = (User) context.getBean("user2");
        User user3 = (User) context.getBean("user3");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}
