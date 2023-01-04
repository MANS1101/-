package chap_05;

public class _02_ArrayLoop {

	public static void main(String[] args) {
		
		String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};
		
		// 배열의 값을 for문을 사용하여 출력
		for (int i = 0; i < 4; i++) {
			System.out.println(coffees[i] + " 하나");
		}
		System.out.println("주세요.");
		System.out.println();
		
//		for문 안에 로직에서 i를 사용하는 이유와 방식을 꼭 알아두어야 함
		
//		i = 0 : System.out.println(coffees[0]);
//		i = 1 :	System.out.println(coffees[1]);
//		i = 2 : System.out.println(coffees[2]);
//		i = 3 : System.out.println(coffees[3]);
//		i = 4 : 조건이 false라서 반복문 종료
		
		// 배열에서 반복문을 돌릴 때, 반복 횟수를 개발자가 직접 적지 않아도 됨!
		// 배열이름.length -> 배열의 길이값을 리턴해줌.
		for (int i = 0; i < coffees.length; i++) {
			System.out.println(coffees[i]);
		}
		System.out.println();
		
		// 향상된 for문 (for - each) 반복문
		for (String coffee : coffees) { 
			System.out.println(coffee);
		}
		
		
	}
	
}