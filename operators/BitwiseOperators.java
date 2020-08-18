package operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 6;
		
		int c = a & b;          //bitwise 'and'  operation
		
		int d = a | b;          //bitwise 'or'  operation
		
		int e = b >> 2;         //right shift operation
		
		int f = b << 1;         //left shift operation
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}

}
