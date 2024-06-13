package com.example.abstractExamples;

import java.sql.SQLOutput;

//Abstraction is hiding the details, We can define an abstract class using the key word abstract
// You can't create an object from an abstract class or access the method from these class, these are the concepts pertaining to the abstract class
public abstract class AbstractExample {

    // abstract class can have an abstract method declared or concrete methods defined
    public abstract String getName();
    public abstract String getDescription();
    public abstract String getCategory();

    public void print(){
        System.out.println("Printing from abstract class");
    }

}
