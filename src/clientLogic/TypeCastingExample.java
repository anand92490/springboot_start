package clientLogic;
import java.util.Scanner;

public class TypeCastingExample {
    public static void main(String args[]){


        Scanner mark = new Scanner(System.in);
        Scanner age = new Scanner(System.in);

        System.out.println("Enter Marks: ");
        String mark1 = mark.nextLine();

        System.out.println("The Mark is " + mark1);

        System.out.println("Enter the age");
        int age1 = age.nextInt();
        System.out.println("The age is " + age1);

        String marks = "30";
        long i = Long.parseLong(marks);
        System.out.println(i);

        short j = 1000;
        byte b = (byte) j; //explicit typecasting eg// narrow type casting - from higher to lower data type casting
        // double-->float--> long--> int=--> char---> short --> byte
        //widening typecasting - converting smaller data type to larger datatype

        System.out.println(b);
        System.out.println(b);

    }

}
