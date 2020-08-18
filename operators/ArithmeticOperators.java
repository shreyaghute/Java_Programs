package operators;

public class ArithmeticOperators {

	public static void main(String[] args) {

		int a = 2;
		int b = 5;
		
//		int x = ++b;                            //increment of +1 before operation 
//		
//		System.out.println(x);
//		
//		int x = b++;                            //increment of +1 after operation
//		
//		System.out.println(x);
		
//		int x = --b;                            //decrement of -1 before operation
//		
//		System.out.println(x);
//		
//		int x = b--;                            //decrement of -1 after operation
//		
//		System.out.println(x);
		
		int c = a + b;
		
		int d = a * a + b * b + 2 * a * b;        //output will be according to BODMAS rule
		
		double e = b / a;                         //integer output since no type-casting
		
		double f = (double)b / (double)a;         //type-casting integer to double
		
		int g = b % a;                            //modulo operator gives you remainder as output
		
		System.out.println(c);
		
		System.out.println(d);
		
		System.out.println(e);
		
		System.out.println(f);
		
		System.out.println(g);

	}

}
