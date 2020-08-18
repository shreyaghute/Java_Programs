package programs;

import java.util.Scanner;              //Scanner class is used

public class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);           //create object for scanner class
		
//		int principle = 500;
//		float rate = 10.5f;
//		int time = 5;                                 //Manual defining of values
		
		int principle = sc.nextInt();                 //User-defined of values
		float rate = sc.nextFloat();
		int time = sc.nextInt();
		
		float simpleInterest = principle * rate * time / 100;
		
		System.out.println("The Simple is : "+simpleInterest);
	}

}
