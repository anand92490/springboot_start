package arrayproj;

public class RemoveDuplicateElementsInArray {

	public static void main(String[] args) {
		int arr[]= {1, 2, 2, 3, 4, 4, 4, 5, 5, 6, 23, 33, 33, 44};
		
		int n = arr.length;
		int arrB [] = new int[n];
		
		int j = 0;
		
		if(n > 0) {
			arrB[j++] = arr[0];
		}
		
		for (int i = 1; i < n; i++) {
			if(arr[i - 1] != arr[i]) {
				arrB[j++] = arr[i];
			}
		}
		
		
		for(int k = 0; k < arrB.length; k++) {
			System.out.print(arrB[k] + " ");
		}
			
	}

}
