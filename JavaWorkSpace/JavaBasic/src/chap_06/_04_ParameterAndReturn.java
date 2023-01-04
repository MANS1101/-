package chap_06;

public class _04_ParameterAndReturn {

	public static int plus(int num1, int num2) {
		return num1 + num2; 
	}
	
	public static int minus(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multi(int num1, int num2) {
		return num1 * num2;
	}
	
	public static double divide(double num1, double num2) {
		return num1 / num2;
	}
	
	public static void main(String[] args) {
		System.out.println(plus(5, 4));
		System.out.println(minus(100, 74));
		System.out.println(multi(7, 3));
		System.out.println(divide(10, 4));
	}
	
}
