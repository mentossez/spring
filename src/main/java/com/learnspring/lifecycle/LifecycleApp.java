package com.learnspring.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleApp {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleConfig.xml");
        HomeLoanXmlConfig homeloan = (HomeLoanXmlConfig) context.getBean("homeLoan");
        System.out.println("--------------------------------------------");
        System.out.println(homeloan);

        // registerShutdownHook() is used in order to run your destroy method
        context.registerShutdownHook();

        PersonalLoanInterfaces personalLoan = (PersonalLoanInterfaces) context.getBean("personalLoan");
        System.out.println("--------------------------------------------");
        System.out.println(personalLoan);
        System.out.println("--------------------------------------------");

        CarLoanAnnotations carLoan = (CarLoanAnnotations) context.getBean("carLoan");
        System.out.println(carLoan);
        System.out.println("--------------------------------------------");
        System.out.println();
    }
}
