package chap_06;

public class _02_Parameter {
	
	// power 메소드는 int형 타입의 값이 호출될 때 같이 넘어와야 한다.
	public static void power(int number) { // parameter, 매개변수
		int result = number * number;
		System.out.println(number + "의 2제곱근은 " + result);
	}
	
	public static void powerByExp(int number, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result = result * number;
		}
		System.out.println(number + "의" + exponent + "제곱근은 " + result);
	}
	public static void main(String[] args) {
		power(2); // 함수안에 값을 인자값이라고함
		power(5); // 함수안에 값을 인자값이라고함
		
		powerByExp(3, 5);
		powerByExp(2, 4);
	}
	
}
