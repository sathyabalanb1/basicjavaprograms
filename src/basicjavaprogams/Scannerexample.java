package basicjavaprogams;

import java.util.Scanner;

public class Scannerexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter your name: ");
        String name = sc.nextLine();  // Read a line of text

        System.out.print("Enter your age: ");
        int age = sc.nextInt();  // Read an integer

        System.out.println("Hello " + name + ", you are " + age + " years old.");

        sc.close();  // Close the scanner

	}

}
