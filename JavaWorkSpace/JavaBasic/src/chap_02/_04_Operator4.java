package chap_02;

public class _04_Operator4 {

	public static void main(String[] args) {
	
		// 논리 연산자
		boolean 김치찌개 = true;
		boolean 계란말이 = true;
		boolean 제육볶음 = true;
		
		System.out.println(김치찌개 || 계란말이 || 제육볶음); // 하나라도 true 이면 true
		System.out.println(김치찌개 && 계란말이 && 제육볶음); // 모두 true 이면 true
		System.out.println();
		
		// And 연산
		System.out.println((5 > 3) && (3 > 1)); // true && true = true
		System.out.println((5 > 3) && (3 < 1)); // true && false = false
		System.out.println();
		// Or 연산
		System.out.println((5 > 3) || (3 > 1)); // true && true = true
		System.out.println((5 > 3) || (3 < 1)); // true && false = true
		System.out.println((5 < 3) || (3 < 1)); // false && false = false
		System.out.println();
		
//		System.out.println(1 < 3 < 5); 사용할 수 없는 코드
		
		// 논리 부정 연산자
		System.out.println(!true);
		System.out.println(!false);
		System.out.println();
		
		System.out.println(!(5 == 5)); // false
	}
	
}
