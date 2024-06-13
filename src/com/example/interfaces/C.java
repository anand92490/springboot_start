package com.example.interfaces;

public class C extends A implements FirstInterface, SecondInterface{
    @Override
    public String m3() {
        System.out.println("This is class C Method m3()");
        return "";
    }

    @Override
    public String m4() {
        System.out.println("This is class C Method m4()");
        return "";
    }
}
