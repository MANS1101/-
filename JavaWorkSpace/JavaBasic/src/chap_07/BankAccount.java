package chap_07;

public class BankAccount {
	
	// 클래스 구성요소 중 필드
	int balance; // 잔액
	Person owner; // 소유인
	
	// 클래스 구성요소 중 메소드
	// 파라미터 : 입금할 액수
	// 리턴 : 성공여부(불린)
	boolean deposit(int amount) {
		if (amount < 0 || owner.cashAmount < amount)
		{
			System.out.println("입금 실패");
			return false;
		}
		
		balance = balance + amount;
		owner.cashAmount = owner.cashAmount - amount;
		
		System.out.println("입금 성공");
		return true;
	}
	
	// 파라미터 : 출금할 액수
	// 리턴 : 성공여부(불린)
	boolean withdraw(int amount) {
		
		return true;
	}
	
	// 파라미터 : 받는사람, 이체할 금액
	// 리턴 : 성공여부(불린)
	boolean transfer(Person preson, int amount) {
		
		return true;
	}
}
