package com.example.polymorphism;

public class Shape {
    public void draw(){
        System.out.println("Draw Shape");
    }
    public void draw(String color){
        System.out.println("Draw Shape with color " + color);
    }
    public void draw(String color, String shape){
        System.out.println("Draw Shape with color " + color + " and shape " + shape);
    }

    public void draw(int... v){ // you can pass any number of arguments using this (String... a) var arguments
        System.out.println("in the var args");
        for(int i = 0; i<v.length; i++){
            System.out.println(v[i]);
        }
    }


}
