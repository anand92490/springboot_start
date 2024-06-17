package com.example.exception;

import java.sql.SQLOutput;

public class ThrowAndThrows {

    public static void ageCheck(int age){ // if ageCheck method is not static you need to create an object to call the method in the main.
        if(age < 18){
            try {
                throw new ArithmeticException("Must be less than 18");
            }catch(ArithmeticException h){
                System.out.println(" In ageCheck exception handling");
            }
        } else {
            System.out.println("Permission granted");
        }
        System.out.println("In ageCheck method");
    }

    public static void main(String[] args) {
        try{
            System.out.println("Before the ageCheck method Call");
            ageCheck(10);
        }catch (ArithmeticException f){
            System.out.println("Handling exception" + f.getMessage());
        }
        System.out.println(" In Throw statement block");
    }
}
