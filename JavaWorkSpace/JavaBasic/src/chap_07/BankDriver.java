package chap_07;

public class BankDriver {

	public static void main(String[] args) {
		
		// 사람 생성
		Person p1 = new Person(); // 이러한 과정을 인스턴스화 한다고 한다.
		p1.name = "홍길동"; 
		p1.age = 35;
		p1.cashAmount = 30000;
		
		// 계좌 생성
		BankAccount a1 = new BankAccount();
		a1.balance = 100000;
		
		// 두 객체의 관계 설정
		p1.account = a1;
		a1.owner = p1;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.cashAmount);
		System.out.println(p1.account); // 출력문을 바꾸려면 오버라이딩이 필요함
		
		System.out.println(p1.account.balance);
	}
}
