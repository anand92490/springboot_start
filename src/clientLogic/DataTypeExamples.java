package clientLogic;

public class DataTypeExamples {

	public static void main(String[] args) {
		byte b = 127; // 1 byte -128 to 127 - 4 digit will create error 2^7-1
		System.out.println(b);
		
	//	Wrapper classes has predefined methods.
		Byte be = 3;
		Short shor = 4234;
		Integer inte = 43;
		Double dub = 2.433434;
		String str = "anand";
		
		be.byteValue();
		
		
		
		short s = 30000; // 2 byte //32768 to 32767 2^16
		System.out.println(s);
		
		int i = 300000000; // 4 bytes 2^32
		System.out.println(i);
		
		long l = 6000000000000000000L; // 8 bytes -- 2^64 bits
		System.out.println(l);
		
		float f = 3.141435132523f; //4 bytes //up to 6 decimals precision 
		System.out.println(f);
		
		double dob = 3.12159234513251350075972340985873492123512; // 8 bytes up to 15 digit precision
		System.out.println(dob);
		
		boolean bool = false;
		if(bool) {
			System.out.println("first statement is printed " + i);
		}
			System.out.println("Second statement is printed " + b);
		
		    
		
		char c  = 'a'; //single character

	}

}
