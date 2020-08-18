package conditionalStatements;

public class TernaryOperator {

	public static void main(String[] args) {
		//Ternary Operator
		int a = 15;
		int b = 8;
		
		int max = 0;
		
		max = a > b ? a : b;      // variable = (condition) ? expressionTrue : expressionFalse;
		
		System.out.println(max+ " is greater number.");

	}

}
