package clientLogic;

public class Client {
// Main method is the client class that will print the messages
	

	
	public static void main(String[] args) {
		
		Logic refvariable = new Logic();
		refvariable.message();
		
		Arguments arg = new Arguments(); 
		
		
		int x = 6650;
		int y = 3330;
		
		int addVal = arg.add(x, y);
		System.out.println(x + " + " + y + " is: " + addVal);
		
		int sub = arg.sub(x,y);
		System.out.println( x + " - " + y + " is: " + sub);
		
		int mult = arg.mult(x, y);
		System.out.println(x + " X " + y + " is: " + mult);
		
		double div = arg.divide(mult, addVal );
		System.out.println(mult + " / " + addVal + " is: " + div);
		
		@SuppressWarnings("unused")
		int staticMethod = Client.addition(x, y);
		System.out.println("The static method is referenced without creating an object\n------\n"+ x + " + " + y + " is: " + addVal);
		
		
		
		
		
		
		

	  

		
//		String name  = "Anand";
//		System.out.println(name.length());
		
	}
	public static int addition(int x, int y){
		int sum = x + y;
		return sum;
	}

}

/* Note
	static - When we create a static methods in a class, we can access the method of that class without 
	creating an object in the main method to reference the method. 
	
	}
*/

		
	/*  NOTES -
		*	primitive data types - byte, int, char, long, double, float, boolean 
	 	*	Non - primitive data types = Arrays, Classes, Interfaces, String
	    *	'String' is a non primitive data type. It is a predefined class. 
	*/


