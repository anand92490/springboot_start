package com.example.exception;

import java.sql.SQLOutput;

public class ThrowAndThrows  {

    // if ageCheck method is not static you need to create an object to call the method in the main.
    public static void ageCheck(int age) throws ArithmeticException, IndexOutOfBoundsException{
        /* We use throws keyword only at the method declaration.
        Used mainly with  checked exception. We can also use multiple exceptions where the method is declared
        throws Exception will throw exception when the method is called.*/
        if(age < 18){
            try { // you can write any number of statements inside the try block
                throw new ArithmeticException("Must be less than 18"); //if you explicitly want to throw an exception within a method block, use the throw keyword
            }catch(ArithmeticException h){ // catch will catch the exception
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
