package chap_02;

public class _05_Operator5 {

	public static void main(String[] args) {

		// 삼항 연산자
		// 결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)
		
		int x = 8;
		int y = 10;
		int max = (x > y) ? x : y;
		System.out.println(max);
		
		int min = (x < y) ? x : y;
		System.out.println(min);
		
		boolean equal = (x == y) ? true : false;
		System.out.println(equal);
		
		String s = (x != y) ? "다르다" : "같다";
		System.out.println(s);
	}
	
}