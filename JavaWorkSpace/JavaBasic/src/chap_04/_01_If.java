package chap_04;

public class _01_If {

	public static void main(String[] args) {
		
		// 조건문 IF
		int hour = 10;
		
		// if문 내에서 하나의 문장을 실행할 때 { } 생략 가능
		if (hour < 14) System.out.println("아이스 아메리카노 +1");
		
		// if문 내에서 2개 이상의 문장을 실행할 때는 { } 생략 불가
		if (hour < 14) {
			System.out.println("아이스 아메리카노 +1");
			System.out.println("샷 추가!");
		}
		
		
		// 오후 2시 이전, 모닝 커피를 마시지 않은 경우
		boolean morningCoffee = false; // 모닝 커피
		
		//if (hour < 14 && morningCoffee == false) {
		if (hour < 14 && !morningCoffee) {
			System.out.println("아이스 아메리카노 +1");
		}
		
		// 방문횟수가 10번 방문 할 때마다 모카라떼 한잔 증정!!
		int numberVisits = 10;
		
		if (numberVisits % 10 == 0) System.out.println("모카라떼 +1");
		
	}

}