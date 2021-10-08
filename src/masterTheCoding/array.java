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
}
