package chap_07;

public class BankAccount {
	
	// Ŭ���� ������� �� �ʵ�
	int balance; // �ܾ�
	Person owner; // ������
	
	// Ŭ���� ������� �� �޼ҵ�
	// �Ķ���� : �Ա��� �׼�
	// ���� : ��������(�Ҹ�)
	boolean deposit(int amount) {
		if (amount < 0 || owner.cashAmount < amount)
		{
			System.out.println("�Ա� ����");
			return false;
		}
		
		balance = balance + amount;
		owner.cashAmount = owner.cashAmount - amount;
		
		System.out.println("�Ա� ����");
		return true;
	}
	
	// �Ķ���� : ����� �׼�
	// ���� : ��������(�Ҹ�)
	boolean withdraw(int amount) {
		
		return true;
	}
	
	// �Ķ���� : �޴»��, ��ü�� �ݾ�
	// ���� : ��������(�Ҹ�)
	boolean transfer(Person preson, int amount) {
		
		return true;
	}
}
