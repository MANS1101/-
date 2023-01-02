package chap_04;

public class _11_Continue {

	public static void main(String[] args) {
		
		// 치킨 주문 손님중에 노쇼 손님이 있다고 가정
		
		int max = 20;
		int sold = 0;
		int noShow = 17;
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + "번 손님, 주문하신 치킨이 나왔습니다.");
			
			// 손님이 없다면?
			if (i == noShow) {
				System.out.println(i + "번 손님, 자리에 없어 다음 손님에게 기회가 넘어갑니다.");
				continue; // continue는 아래 코드 실행하지 않고 다시 for문으로 돌아감
			}
			
			sold++;
			if (sold == max) {
				System.out.println("금일 재료가 모두 소진되었습니다.");
				break;
			}
		}
		
	}

}
