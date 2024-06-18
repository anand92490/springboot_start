package com.example.exception;

public class CustomException extends Exception {
    public CustomException(String message){ // constructor
        super(message);
    }

    public CustomException(){ //method overLoad example
        super();
    }

}
