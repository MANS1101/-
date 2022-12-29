package chap_04;

public class _04_SwitchCase {

	public static void main(String[] args) {
		
		// Switch Case
		
		// ������ ���� ���б� ����
		// 1�� : ���� ���б�
		// 2�� : �ݾ� ���б�
		// 3�� : �ݾ� ���б�
		// �� �� : ���б� ����� �ƴ�
		
		int ranking = 1;
		
//		if (ranking == 1) {
//			System.out.println("���� ���б�");
//		} else if (ranking == 2) {
//			System.out.println("�ݾ� ���б�");
//		} else if (ranking == 3) {
//			System.out.println("�ݾ� ���б�");
//		} else {
//			System.out.println("���б� ����� �ƴ�");
//		}
		
		if (ranking == 1) {
			System.out.println("���� ���б�");
		} else if (ranking <= 3) {
			System.out.println("�ݾ� ���б�");
		} else {
			System.out.println("���б� ����� �ƴ�");
		}
		System.out.println("========================");
		ranking = 2;
		switch (ranking) {
			case 1: 
				System.out.println("���� ���б�"); 
				break;
			case 2:	
				System.out.println("�ݾ� ���б�"); 
				break;
			case 3: 
				System.out.println("�ݾ� ���б�"); 
				break;
			default:
				System.out.println("���б� ����� �ƴ�");
		}
		
		System.out.println("========================");
		
		// case�� ���� �ߺ� �� ���
		ranking = 2;
		switch (ranking) {
			case 1: 
				System.out.println("���� ���б�"); 
				break;
			case 2:	
			case 3: 
				System.out.println("�ݾ� ���б�"); 
				break;
			default:
				System.out.println("���б� ����� �ƴ�");
		}
		
		// �߰�� ����Ʈ���� �ȷ��� �Ѵ�. ���ذ��� 500,000���̸� ��޿� ���� ������ �����ȴ�.
		// ��� A : +50,000
		// ��� B : +40,000
		// ��� C : +30,000
		// ��� D : +20,000
		// ��� E : +10,000
		
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
		System.out.println(grade + "��� ��ǰ�� ���� : "+ price + "��"); 
	}

}
