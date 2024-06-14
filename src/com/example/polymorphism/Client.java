package com.example.polymorphism;

public class Client {
    public  static void main(String args[]) {

        //Method overloading - is done in one class only
        MethodOverLoading m = new MethodOverLoading();
        System.out.println(m.add(5,6));
        System.out.println(m.add(5.1f,2.3f,3.2f));
        System.out.println( m.add(3.5,4.5));

        Shape s = new Shape();

        // it checks the overloaded methods based on the argument during the compile time and related to that specific methods
        s.draw();
        s.draw("red");
        s.draw("black", "circle");

        s.draw(1,2,3,4,5);
        s.draw(3,5,6,2,3,4,5,34,34);
        s.draw(3,32,44,3);

        //Method Overriding - It is done in multiple classes

        B b = new B();
        A a1 = new A();
        A a2 = new B(); // you can store subclass into a super class
       // B b2 = new A(); // invalid syntax
        // first b.m1() will  check the subclass for the method if not, then it will look for the method in the super class

        b.m1(6,4); // Class B
        a1.m1(8,9); // Class A
        a2.m1(4,9); // Class B

        // Interface
         /*  You cannot create an object from an interface But you can pass subclass (Operations) as
         reference variable for (MethodOverLoadingInterface) since it implements the parent interface */

        Operations o = new Operations(); // Operations object
        MethodOverloadingInterface operations1 = new Operations(); // passing object as on reference variable for parent Interface

        operations1.add(5,6); // passing arguments to the original method
        operations1.add(5,6,8); // passing arguments to the overridden method 2
        operations1.add(5,6,5,7); // passing arguments to the overridden method 3








    }
}
