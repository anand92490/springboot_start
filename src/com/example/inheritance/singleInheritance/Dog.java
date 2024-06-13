package com.example.inheritance.singleInheritance;

// We can inherit properties from another class using the keyword extends to inherits attributes of another class
// We are reusing the code from the super class or parent class
public class Dog extends Animal {

    public void bark(){

        System.out.println("Barking..." + super.color); // super keyword will allow the base class to access the properties of parent class
    }
}
