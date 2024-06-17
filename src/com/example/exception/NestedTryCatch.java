package com.example.exception;

public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            System.out.println("In try 1");
            try {
                System.out.println("In try 2");
                try {
                    System.out.println("In try 3");
                    int array[] = {1, 2, 3, 4};
                    System.out.println(array[10]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("In ArrayIndexOutOfBoundsException exception");
                    System.out.println("Try3 block");

                }
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic exception");
                System.out.println("Try2 block");

            }
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
            System.out.println("Try1 block");
        }
    }
}
