package com.example.exception;

public class Exception2 {
    public static void main(String[] args) {

        /*A checked exception is caught at compile time whereas a runtime or unchecked exception is,
        as it states, at runtime. A checked exception must be handled either by re-throwing or
        with a try catch block, whereas an unchecked isn't required to be handled.*/

        //checked exception

        // Building b = new Building(); // when the objects are not found - it's an unchecked exception

        //unchecked exception
        String s = null;
      //  System.out.println(s.length());// runtime exception - null pointer exception
    }
}
