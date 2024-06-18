package com.example.exception;

public class Client {

    public static void validateAge(int age) throws CustomException{
        if(age < 18){
            throw new CustomException("Age myst be less than 18"); // checked exception

        }
        System.out.println("age is valid");
    }

    public static void main(String[] args) throws CustomException{
        validateAge(16);
    }
}
