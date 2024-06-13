package com.example.interfaces;

// Interface is like a contract, Eg JDBC(Magnus Zoom- Day 17 - 1:18) - java database connectivity specific jar fies-- that forces the user to implement the methods.
public interface FirstInterface  {

    public static final int x = 10; // by default in interface the variables are public static final
    int y = 50;
    // In interface, we can declare the method, but we cannot define a method. It will give us an error

    // Interface allows just the declaration of the methods
    public void firstMethod(); // == public abstract void firstMethod() // We use abstract keyword for declaring the method and not defining
    public void secondMethod(); // The access modifier for these methods by default are public

    //abstract method is a way of declaring the method without any implementation. by default public void firstMethod(); == public abstract void firstMethod()
    // if we declare abstract method we must also declare abstract class

}
