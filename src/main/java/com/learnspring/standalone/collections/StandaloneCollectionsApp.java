package com.learnspring.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class StandaloneCollectionsApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standaloneCollectionsConfig.xml");

    }
}
