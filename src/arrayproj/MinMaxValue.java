package arrayproj;

public class MinMaxValue {
	public static void main(String args[]) {
		int arr[]= {3, 4, 5, 1, -5, 34, 44, 32, 32, 32};
		int min = arr[0];
		int max = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
			if(arr[i] > max) {
				max = arr[i];
			}		
		}
		 System.out.println("The minimum value is: " + min);
		 System.out.println("The maximum value is: " + max);
	}

}
