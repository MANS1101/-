package chap_06;

public class _05_Overloading {
			// Over라이딩  <- 2학년때 배움
	public static int getPower(int number) {
		int result = number * number;
		return result;
	}
	
	public static int getPower(String strnumber) {
		int number = Integer.parseInt(strnumber);
		return number * number;
	}
	
	public static int getPower(int number, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= number;
		}
		return result;
	}
	
	// 입력값에 따라 유사한 기능을 수행하는 경우 메서드 이름을 똑같이 만들어서 사용할 수 있는데,
	// 아래의 조건을 지켜야 한다.
	// 1. 데이터 타입이 달라야함. 
	// 2. 파라미터의 수가 달라야 함.
	
	// 이것을 메소드 오버로딩이라고 한다.
	
	public static void main(String[] args) {
		System.out.println(getPower(4));
		System.out.println(getPower("9"));
		System.out.println(getPower(5, 4));
	}
	
}
