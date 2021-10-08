package masterTheCoding; // Import the Scanner class
import java.util.Scanner;

public class mainClass {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);  // Create a Scanner object
		System.out.println("DATA STRUCTURES ACTIONS:\n");
		boolean running = true;
		
		while (running) {
			System.out.println("Actions menu:");
			System.out.println("0. Exit\n" +
					"1. Reverse string");
		    System.out.print("\nChoose action:");

		    int choice = sc.nextInt();  // Read user input
		    if(choice == 0)
		    	running = false;
		    else if (choice ==1) 
		    	array.reverse();
				
			
			
			
		}
		
	}
}
