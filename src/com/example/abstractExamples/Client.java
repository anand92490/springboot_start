package com.example.abstractExamples;

public class Client {
    public static void main(String[] args){
        A a = new A();
        a.getDescription();
        a.getName();
        a.getCategory();
        a.print();

       // AbstractExample b = new AbstractExample();
        // You cannot create an object from an abstract class
        // to access the methods from an abstract class you must create another class that inherits(extends) the properties from the abstract class
    }
}
