package com.example.inheritance.hierarchical;

public class Client {
    public static void main(String args[]){
        C c = new C();
        c.m1();
        c.m3();

        B b = new B();
        b.m1();
        b.m2();

        A a = new C();
        a.m1();


    }
}
