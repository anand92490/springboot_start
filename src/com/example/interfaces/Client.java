package com.example.interfaces;

public class Client {
    public static void main(String args[]){
        A a = new A();
        a.firstMethod();
        a.secondMethod();

        B b = new B();
        b.firstMethod();
        b.secondMethod();

        C c = new C();
        c.m3();
        c.m4();

    }
}
