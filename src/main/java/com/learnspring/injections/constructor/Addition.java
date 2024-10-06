package com.learnspring.injections.constructor;

//Ambiguity problem
/*
    if it doesn't find constructor with String parameters then constructor will be called by order
    if you want to call specific constructor then you can define parameter type in XML file
    you can also define index in XML file, values will push in parameters accordingly
*/
public class Addition {
    private int a;
    private int b;

    public Addition(int a, int b) {
        System.out.println("Constructor : int, int");
        this.a = a;
        this.b = b;
    }

    public Addition(double a, double b) {
        System.out.println("Constructor : Double, Double");
        this.a = (int) a;
        this.b = (int) b;
    }

    public Addition(String a, String b) {
        System.out.println("Constructor : String, String");
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
    }

    void doSum() {
        System.out.println("Value of a : " +a);
        System.out.println("Value of b : " +b);
        System.out.println("Addition is "+ (this.a+this.b));
    }
}
