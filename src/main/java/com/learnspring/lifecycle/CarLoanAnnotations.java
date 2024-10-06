package com.learnspring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/*
    Life cycle using Annotations
    @PostConstruct
    @PreDestroy
*/
public class CarLoanAnnotations {

    private Long amount;

    @PostConstruct
    public void init() {
        System.out.println("Initialising CarLoan...\n");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Clearing CarLoan... Thank you!");
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        System.out.println("Setting CarLoan amount...");
        this.amount = amount;
    }

    public CarLoanAnnotations() {
    }

    @Override
    public String toString() {
        return "CarLoan[" +
                "amount=" + amount +
                ']';
    }
}
