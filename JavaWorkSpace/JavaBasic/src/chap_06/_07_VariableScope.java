package chap_06;

public class _07_VariableScope {

	public static void mathodA(int number) {
		System.out.println(number);
	}
	
	public static void mathodB() {
		int result = 1;
	}
	
	public static void main(String[] args) {
		int number = 33;
		int result = 55;
		
		mathodA(number);
		mathodB();
		
		System.out.println(result);

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
//		System.out.println(i);

		int j;
		
		for (j = 0; j < 5; j++) {
			System.out.println(j);
		}
		System.out.println("for¹® ¹Û : " + j);
	}
	
}
