package chap_02;

public class _01_Operator1 {
	
	public static void main(String[] args) {
		
		// ��� ������
		
		// �Ϲ� ����
		System.out.println(4 + 2); // 6
		System.out.println(4 - 2); // 2
		System.out.println(4 * 2); // 8
		System.out.println(4 / 2); // 2
		System.out.println(5 / 2); // 2.5 -> 2
		System.out.println(2 / 4); // 0.5 -> 0
		System.out.println(4 % 2); // 0
		System.out.println(5 % 2); // 1
		
		// �켱 ���� ����
		System.out.println(2 + 2 * 2); // 6
		System.out.println((2 + 2) * 2); // 8
		
		// ������ �̿��� ����
		int a = 20;
		int b = 10;
		int c;
		
		c = a + b;
		System.out.println(c); // 30
	
		c = a - b;
		System.out.println(c); // 10
		
		// ���� ���� ++, --
		int val;
		val = 10;
		System.out.println(val); // 10
		System.out.println(++val); // 11, val = val + 1 �� ������ �� val�� ���
		System.out.println(val); // 11
		System.out.println("====");
		val = 10;
		System.out.println(val); // 10
		System.out.println(val++); // 10, val�� ����� ������ val = val + 1 �� ���� 
		System.out.println(val); // 11
		System.out.println("====");
		val = 10;
		System.out.println(val); // 10
		System.out.println(--val); // 9
		System.out.println(val); // 9
		System.out.println("====");
		val = 10;
		System.out.println(val); // 10
		System.out.println(val--); // 10
		System.out.println(val); // 9
		
		// ���� ����ȣ ǥ
		int waiting = 0;
		System.out.println("��� �ο� : " + waiting++); // ��� �ο� : 0
		System.out.println("��� �ο� : " + waiting++); // ��� �ο� : 1
		System.out.println("��� �ο� : " + waiting++); // ��� �ο� : 2
		System.out.println("�� ��� �ο� : " + waiting++); // �� ��� �ο� : 3
		
		
		
	}
	
}