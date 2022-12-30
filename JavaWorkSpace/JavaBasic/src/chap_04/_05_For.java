package chap_04;

public class _05_For {
	
	public static void main(String[] args) {
		// 반목문 for
		// 성일 매장
		System.out.println("어서오세요. 성일 매장입니다.");
		// 또 다른 손님이 온다면?
		System.out.println("어서오세요. 성일 매장입니다.");
		System.out.println("어서오세요. 성일 매장입니다.");
		System.out.println("어서오세요. 성일 매장입니다.");
		System.out.println("어서오세요. 성일 매장입니다.");
		System.out.println("어서오세요. 성일 매장입니다.");
		System.out.println("어서오세요. 성일 매장입니다.");
		// 만약에 인사법이 바뀌면 
		System.out.println("환영합니다. 성일 매장입니다.");
		// 매장 이름이 변경되면
		System.out.println("환영합니다. 소프트 매장입니다.");
		
		System.out.println("=========== 반복문 ===========");
		
		int num = 1;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("환영합니다. 소프트 매장입니다." + i);
		}
		System.out.println();
		
		// 10 이하의 자연수 중에 짝수만 출력
		System.out.println("=============");
		System.out.println("짝수");
		for (int i = 0; i <= 10; i+=2) {
			System.out.println(i);
		}
		// 10 이하의 자연수 중에 홀수만 출력
		System.out.println("=============");
		System.out.println("홀수");
		
		for (int i = 1; i <= 10; i+=2) {
			System.out.println(i);
		}
		// 5이하의 자연수로 5, 4, 3, 2, 1 작아지게 출력
		System.out.println("=============");
		System.out.println("5이하의 자연수 작아지게");
		
		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}
		// 1부터 100까지의 합계를 구해보자!
		System.out.println("=============");
		System.out.println("1부터 100까지의 합계를 구해보자!");
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
		
	}
	
}
