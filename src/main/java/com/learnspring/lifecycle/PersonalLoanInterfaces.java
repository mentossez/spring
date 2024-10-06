package com.learnspring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/*
    Life cycle using interfaces
    InitializingBean
    DisposableBean
*/
public class PersonalLoanInterfaces implements InitializingBean, DisposableBean {
    private Long amount;

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        System.out.println("Setting PersonalLoan amount...");
        this.amount = amount;
    }

    public PersonalLoanInterfaces() {
    }

    @Override
    public String toString() {
        return "PersonalLoan [" +
                "amount=" + amount +
                ']';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialising PersonalLoan...\n");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Clearing PersonalLoan... Thank you!");
    }
}
