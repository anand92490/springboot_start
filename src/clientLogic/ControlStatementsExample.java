package clientLogic;

public class ControlStatementsExample {
    public static void main(String args[]){
        //if
        //if else
        //nested if
        //if-else-if ladder
        int y = 5;
        int x = 6;
        int i = 20;

        if( y < 10) {  // must evaluate either true of false in an if condition // only accepts boolean value
            System.out.println("Inside if block");
            System.out.println("The value of y = " + y);
        } else {

            System.out.println("Outside if block");
        }

        //nested if
        if(y<17){
            System.out.println("Inside nested if block ");
            if(x <= 6)
                System.out.println("Inside nested if block 2");
        }

        if(y < x)
            System.out.println("single statement no braces, only the first statement is part of if block");

        //if-else-if ladder
        if(i == 10){ // false
            System.out.println("i = 10");
        }else if(i == 15){ //false
            System.out.println("i = 15");
        } else if(i == 20){ //true --> this statement will be printed
            System.out.println("i = 20");
        }else{
            System.out.println("i not present in block");
        }
    }
}
