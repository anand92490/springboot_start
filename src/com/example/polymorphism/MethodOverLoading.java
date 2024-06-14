package com.example.polymorphism;

// polymorphism can be achieved through method overloading and method overriding
// class only has methods and variables
public class MethodOverLoading {

    public int add(int a, int b){
        return a + b;
    }

    //method name is the same but the arguments are different is called method overloading
    // can have different access modifier, data types or return types. One class is sufficient for method overloading
    protected float add(float a, float b, float c) {
        return a + b + c;
    }

     public double add(double a, double b){
        return a + b;
    }

}
