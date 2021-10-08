package masterTheCoding;
import java.util.Scanner; // Import the Scanner class

public class array {
	
    static Scanner sc = new Scanner(System.in);  // Create a Scanner object

	// This function reverses a string
	static void reverse() {
		System.out.print("Enter a string to reverse:");
		String strToRev = sc.nextLine();  // Read user input
        char[] revStr = strToRev.toCharArray();
        System.out.print("Reversed string: ");
        for (int i = revStr.length - 1; i >= 0; i--)
            System.out.print(revStr[i]);
        System.out.println("\n");
	}
	
	// This function merge sorted arrays
	static void merge() {
		System.out.print("Enter the number of numbers you want to store in the first array: ");  
		int n = sc.nextInt();  
		int[] firstArray = new int[n];  
		System.out.println("Enter the elements of the first array in a sorted way: ");  
		for(int i = 0; i < n; i++)  //reading array elements from the user   
			firstArray[i]=sc.nextInt();  
		  
		System.out.print("Enter the number of numbers you want to store in the second array: ");  
		int m = sc.nextInt();  
		int[] secondArray = new int[m]; 
		System.out.println("Enter the elements of the second array in a sorted way: ");  
		for(int i = 0; i < m; i++)  //reading array elements from the user   
			secondArray[i]=sc.nextInt();  
		
		int[] mergedArray = new int[n+m];
		int firstPointer = 0, secondPointer = 0;
		for(int i = 0; i < n+m; i++) {
			if(firstPointer == n) {
				mergedArray[i] = secondArray[secondPointer];
				secondPointer++;
			}
			else if(secondPointer == m) {
				mergedArray[i] = firstArray[firstPointer];
				firstPointer++;
			}
			else if(firstArray[firstPointer] <= secondArray[secondPointer]) {
				mergedArray[i] = firstArray[firstPointer];
				firstPointer++;				
			}
			else {
				mergedArray[i] = secondArray[secondPointer];
				secondPointer++;
			}
		}
		System.out.println("The sorted array: ");
		for(int i = 0; i < n+m; i++) {
			System.out.print(mergedArray[i]);
			if(i != (n + m -1)) {
				System.out.print(", ");
			}
		}
        System.out.println("\n");
	}
}
