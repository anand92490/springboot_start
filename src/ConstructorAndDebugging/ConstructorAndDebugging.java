package ConstructorAndDebugging;

 public class ConstructorAndDebugging {
	int x;
	int y;
	int z;


	
	// constructor don't have return type 
	// constructor had same name as class name
	// the purpose is to initialize the instance variable
	
	
	//if you don't create the constructor JVM creates a default constructor
	public ConstructorAndDebugging() { 

	}
	
	public ConstructorAndDebugging(int a, int b) { // ConstructorAndDebugging(int x, int y)//in parameterized constructor, we have to pass the the value when we create an object
		this.x = a;
		this.y = b;
			
	}
	
	
	public int add() {
		int z = x + y; 
		return z;
	}
	  
	public static void main(String[] args) {
		
// to debug, first set the debug break point by selecting the line number
		ConstructorAndDebugging m = new ConstructorAndDebugging(44,33);
		ConstructorAndDebugging n = new ConstructorAndDebugging(23,34);
  		
		int z = m.add();
	
		System.out.println("Sum is " + z);
		System.out.println("Sum is " + n.add());
	}
	
	

}
 