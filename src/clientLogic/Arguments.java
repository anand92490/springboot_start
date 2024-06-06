package clientLogic;

public class Arguments {

	public int add(int i, int j) {
		
		int sum = i + j;
		return sum;
		
	}

	public int sub(int i, int j) {
		int sub = i - j;
		return sub;
	}
	
	public int mult(int x, int y) {
		int mult = x*y;
		return mult;
	}
	
	public double divide(double e, double f) {
		double divide = e/f;
		
		if(e == 0 || f == 0) {
			System.out.println("The number cannot be divided by 0");
		}
		return divide;
	}


}
