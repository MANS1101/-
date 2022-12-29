package chap_04;

public class _02_Else {

	public static void main(String[] args) {
		
		// 조건문 IF Else
		int hour = 10;
		
		if (hour < 14) { // 14시 이전에 방문했을 경우
			System.out.println("아이스 아메리카노 +1");
		} else { // 그 외의 경우
			System.out.println("샷 추가!");
		}
		System.out.println("커피 주문 완료 #1");
		
		boolean morningCoffee = true;
		if (hour >= 20 || morningCoffee ) System.out.println("아이스 아메리카노(디카페인)");
		else System.out.println("아이스 아메리카노!");
		System.out.println("커피 주문 완료 #2");
	}
	
}
