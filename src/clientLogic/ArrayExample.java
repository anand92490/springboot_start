package clientLogic;

public class ArrayExample {

	public static void main(String[] args) {
		
		int z[] = {50,60,70,90,34,90};
		System.out.println(z[3]);
//		System.out.println(z[5]);
		
		for(int i = 0; i < z.length; i++) {
			System.out.println(z[i]);
		}
		System.out.println("---\n---");
		//declare and instantiate an array
		// Arrays is non primitive or reference data type
		
		
		
		
		int sub[] = new int[5]; //[5] size of the array
		
		
		int sub2[] = new int[z.length]; //size of the z array
//		System.out.println(sub[0]); // The default value of the array is 0 since nothing has been declared{0,0,0,0,0,0,0}.

		
		
		int total = 0;
		
		for(int i = 0; i <= sub2.length - 1; i++) {
			sub2 [i] = z[i];
			total = total + sub2[i];
			System.out.println(sub2[i]);
			
		}
		
		System.out.println("The total is:" + total);
		
/*
 Total[i] = 0
 total[0] = 0+50 = 50
 total[1] = 50+60 = 110 
 total[2]= 110+70 = 180 ... until the loop condition is false
 */
		
		
		
//		sub[0] = 10;
//		sub[1] = 30;
//		sub[4] = 20;
//		sub[5] = 50;
		
	}

}
