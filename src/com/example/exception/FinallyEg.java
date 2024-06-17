package com.example.exception;

public class FinallyEg {
    public static void main(String[] args) {
        try{
            System.out.println("In try block");
        }catch(Exception e){
            System.out.println("In the catch block");
        }finally { //closing the operation or resources. finally can be used with the closing the database connection of file system
            System.out.println("In finally block");
        }
    }
}
