package chap_07;

public class BankDriver {

	public static void main(String[] args) {
		
		// ��� ����
		Person p1 = new Person(); // �̷��� ������ �ν��Ͻ�ȭ �Ѵٰ� �Ѵ�.
		p1.name = "ȫ�浿"; 
		p1.age = 35;
		p1.cashAmount = 30000;
		
		// ���� ����
		BankAccount a1 = new BankAccount();
		a1.balance = 100000;
		
		// �� ��ü�� ���� ����
		p1.account = a1;
		a1.owner = p1;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.cashAmount);
		System.out.println(p1.account); // ��¹��� �ٲٷ��� �������̵��� �ʿ���
		
		System.out.println(p1.account.balance);
	}
}
