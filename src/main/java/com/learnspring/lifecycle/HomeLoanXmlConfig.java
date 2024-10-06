package com.learnspring.lifecycle;

/*
    Life cycle using XML configuration
    public void init() {}
    public void destroy() {}
*/
public class HomeLoanXmlConfig {
    private Long amount;

    public void init() {
        System.out.println("Initialising HomeLoan...\n");
    }

    public void destroy() {
        System.out.println("Clearing HomeLoan... Thank you!");
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        System.out.println("Setting HomeLoan amount...");
        this.amount = amount;
    }

    public HomeLoanXmlConfig() {
    }

    @Override
    public String toString() {
        return "HomeLoan [" +
                "amount=" + amount +
                ']';
    }
}
