package com.example.interfaces;

public class B implements FirstInterface, SecondInterface{
    @Override
    public void firstMethod() {
        System.out.println("Class A implements FirstInterface, first method");
    }

    @Override
    public void secondMethod() {
        System.out.println("Class A implements FirstInterface, second method");
    }

    @Override
    public String m3() {
        return "This is class B method m3()";
    }

    @Override
    public String m4() {
        return "This is class B method m4()";
    }
}
