package chap_04;

public class _10_Break {

	public static void main(String[] args) {
		
		// Break
		// 치킨 집에서 매일 20마리만 판매 (1인당 1마리만 구매 가능)
		// 손님이 50명이 대기
		
		// for문
		int max = 20;
		for (int i = 1; i <= 50; i++) {
			System.out.println(i+"번 손님, 주문하신 치킨 나왔습니다.");
			if (i == max) {
				System.out.println("금일 재료가 모두 소진되었습니다.");
				break;
			}
		}
		
		// while문
		int index = 1;
		
		while (true) {
			System.out.println(index + "번째 고객입니다.");
			if (index == max) {
				System.out.println("금일 순번은 여기까지입니다.");
				break;
			}
			index++;
		}
	}

}
