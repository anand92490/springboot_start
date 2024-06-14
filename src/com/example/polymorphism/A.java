package com.example.polymorphism;

//method overriding -
    // You have to inherit the parent class to override
    // The method name, return type and the arguments must be the same but the access modifier can be different in the overridden method
    // private method can not be accessed in a base class because private methods cannot be overridden
    // to inherit the method it must either be public or default. If you omit public keyword the access modifier is default, which is like public essentially
    //

public class A {

    public int m1(int x, int y){
        return x + y;
    }
}
