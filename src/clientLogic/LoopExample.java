package clientLogic;

public class LoopExample {
    public static void main(String args[]){
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) { // first inner for loop gets executed
                System.out.println(i);
            }
            System.out.println("i value " + i);
        }

            /*
            i = 0
                   j = 0; 0 < 5 print 0
                   j = 1; 1 < 5 print 0
                   j = 2; 2 < 5 print 0
                   j = 3; 1 < 5 print 0
                   j = 4; 2 < 5 print 0
            i = 1
                   j = 0; 0 < 5 print 1
                   j = 1; 1 < 5 print 1
                   j = 2; 2 < 5 print 1
                   j = 3; 1 < 5 print 1
                   j = 4; 2 < 5 print 1


            */
//while loop
        int i = 0;   // initialize a variable
        while(i < 5){ // check the condition
            System.out.println(" i value " + i); // execute
            i++;                // Developers have to increment the value manually
            /*
            * i = 0;
            *   i = 1;
            *       i = 2;
            *           i = 4;
            *               i = 4;
            *         */
        }
    }
}
