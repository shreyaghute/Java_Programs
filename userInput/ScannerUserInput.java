package userInput;

import java.util.Scanner;              //Scanner class is used
public class ScannerUserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);           //create object for scanner class
		
		int x = sc.nextInt();
		
		double y = sc.nextDouble();
		
//		String a = sc.nextLine();
		
		System.out.println(x);
		
		System.out.println(y);
		
//		System.out.println(a);
	}

}
