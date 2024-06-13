package com.example.interfaces;

public class B implements FirstInterface{
    @Override
    public void firstMethod() {
        System.out.println("Class A implements FirstInterface, first method");
    }

    @Override
    public void secondMethod() {
        System.out.println("Class A implements FirstInterface, second method");
    }
}
