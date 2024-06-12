package arrayproj;

public class addElementsInArray {
	public static void main(String args[]) {
		int arr [] = new int[11];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		arr[arr.length -1] = 22;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
