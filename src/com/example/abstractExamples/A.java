package com.example.abstractExamples;

public class A extends AbstractExample{
    @Override
    public String getName() {
        System.out.println("PC");
        return "PC";
    }

    @Override
    public String getDescription() {
        System.out.println("dell");
        return "dell";
    }

    @Override
    public String getCategory() {
        System.out.println("i 9: intel chip...");
        return "i 9: intel chip";
    }

    public void print(){
        super.print();
        System.out.println("Printing form class A");
    }
}
