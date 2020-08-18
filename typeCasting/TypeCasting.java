package typeCasting;

public class TypeCasting {

	public static void main(String[] args) {
		//Automatic
		byte x = 5;
		
		int y = x;
		
		double z = y;
		
		System.out.println(y);
		System.out.println(z);
		
		//Manual
		double a = 2.123;
		
		int b = (int)a;
		
		System.out.println(a);
		System.out.println(b);
	}

}
