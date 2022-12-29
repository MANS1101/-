package chap_04;

public class _04_SwitchCase {

	public static void main(String[] args) {
		
		// Switch Case
		
		// 석차에 따른 장학금 지급
		// 1등 : 전액 장학금
		// 2등 : 반액 장학금
		// 3등 : 반액 장학금
		// 그 외 : 장학금 대상이 아님
		
		int ranking = 1;
		
//		if (ranking == 1) {
//			System.out.println("전액 장학금");
//		} else if (ranking == 2) {
//			System.out.println("반액 장학금");
//		} else if (ranking == 3) {
//			System.out.println("반액 장학금");
//		} else {
//			System.out.println("장학금 대상이 아님");
//		}
		
		if (ranking == 1) {
			System.out.println("전액 장학금");
		} else if (ranking <= 3) {
			System.out.println("반액 장학금");
		} else {
			System.out.println("장학금 대상이 아님");
		}
		System.out.println("========================");
		ranking = 2;
		switch (ranking) {
			case 1: 
				System.out.println("전액 장학금"); 
				break;
			case 2:	
				System.out.println("반액 장학금"); 
				break;
			case 3: 
				System.out.println("반액 장학금"); 
				break;
			default:
				System.out.println("장학금 대상이 아님");
		}
		
		System.out.println("========================");
		
		// case의 값이 중복 될 경우
		ranking = 2;
		switch (ranking) {
			case 1: 
				System.out.println("전액 장학금"); 
				break;
			case 2:	
			case 3: 
				System.out.println("반액 장학금"); 
				break;
			default:
				System.out.println("장학금 대상이 아님");
		}
		
		// 중고로 스마트폰을 팔려고 한다. 기준값은 500,000원이며 등급에 따라 가격이 조정된다.
		// 등급 A : +50,000
		// 등급 B : +40,000
		// 등급 C : +30,000
		// 등급 D : +20,000
		// 등급 E : +10,000
		
		int price = 500000;
		char grade = 'A'; 
		
		switch (grade) {
			case 'A' : 
				price += 50000;
				break;
			case 'B' : 
				price += 40000;
				break;
			case 'C' : 
				price += 30000;
				break;
			case 'D' : 
				price += 20000;
				break;
			case 'E' : 
				price += 10000;
				break;
		}
		System.out.println(grade + "등급 제품의 가격 : "+ price + "원"); 
	}

}
