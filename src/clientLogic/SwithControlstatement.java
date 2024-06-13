package clientLogic;

public class SwithControlstatement {
    public static void main(String args[]){
         //switch break statement
        // all the statements gets executed inder case:
        int n = 20;

        switch (n){
            case 10: {
                System.out.println("Value is 10");
                break;
            }

            case 20:
                System.out.println("Value is 20");
                System.out.println("second statement also gets executed");
            break;

            case 30:{
                System.out.println("Value is 30");
                break;
            }
            default:
                System.out.println("The value is not present");

        }



    }
}
