package com.example.exception;

public class ExceptionEg {
    public static void main(String[] args) {
       try {
           System.out.println("Exception");

           int a = 10;
           int b = 0;
           int c = a / b;

           int a2[] = {1, 2, 3, 4, 5};
           System.out.println(a2[5]);


           System.out.println(a2);
           System.out.println("The program will stop here. The value wont be printed if the exception is thrown");
           // } catch (ArithmeticException e){
           //SubClasses Exception should always be on top order.
           // [Exception] is the super class of all the exception. It will catch all the exception
           //All the exceptions are handled in the catch block
       }catch(ArithmeticException e){
               System.out.println("If there's arithmetic error below this line. it won't handle the exception." +
                       "\nThis catch block is associated with the try block above it. Thus, execution is stopped");
               int a = 10;
               int b = 0;
               int c = a/b;
           System.out.println("The value is " + c);


        }catch(IndexOutOfBoundsException e){
           System.out.println(e.getMessage());

       }catch(Exception e) { // Exception is the super class of all exception and therefore, it must be added at the last since it has all the exceptions included
           System.out.println("You can't divide by zero." +
                   " Exception message-->" + e.getMessage());
       }


        System.out.println("Rest of the program continues to execute if we handle the exception");
        }

    //Try, catch, throw, throws, finally
}
