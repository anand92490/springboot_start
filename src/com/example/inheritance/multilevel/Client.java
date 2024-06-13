package com.example.inheritance.multilevel;

public class Client {
    public static void main(String arg[]){
// multilevel inheritance example
        C c = new C();
        c.m3();
        c.m2();
        c.m1();

        B b = new B();
        b.m1();
        b.m2();

        A a = new A();
        a.m1();

    }
}
