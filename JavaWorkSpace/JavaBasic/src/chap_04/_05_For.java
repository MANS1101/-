package chap_04;

public class _05_For {
	
	public static void main(String[] args) {
		// �ݸ� for
		// ���� ����
		System.out.println("�������. ���� �����Դϴ�.");
		// �� �ٸ� �մ��� �´ٸ�?
		System.out.println("�������. ���� �����Դϴ�.");
		System.out.println("�������. ���� �����Դϴ�.");
		System.out.println("�������. ���� �����Դϴ�.");
		System.out.println("�������. ���� �����Դϴ�.");
		System.out.println("�������. ���� �����Դϴ�.");
		System.out.println("�������. ���� �����Դϴ�.");
		// ���࿡ �λ���� �ٲ�� 
		System.out.println("ȯ���մϴ�. ���� �����Դϴ�.");
		// ���� �̸��� ����Ǹ�
		System.out.println("ȯ���մϴ�. ����Ʈ �����Դϴ�.");
		
		System.out.println("=========== �ݺ��� ===========");
		
		int num = 1;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("ȯ���մϴ�. ����Ʈ �����Դϴ�." + i);
		}
		System.out.println();
		
		// 10 ������ �ڿ��� �߿� ¦���� ���
		System.out.println("=============");
		System.out.println("¦��");
		for (int i = 0; i <= 10; i+=2) {
			System.out.println(i);
		}
		// 10 ������ �ڿ��� �߿� Ȧ���� ���
		System.out.println("=============");
		System.out.println("Ȧ��");
		
		for (int i = 1; i <= 10; i+=2) {
			System.out.println(i);
		}
		// 5������ �ڿ����� 5, 4, 3, 2, 1 �۾����� ���
		System.out.println("=============");
		System.out.println("5������ �ڿ��� �۾�����");
		
		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}
		// 1���� 100������ �հ踦 ���غ���!
		System.out.println("=============");
		System.out.println("1���� 100������ �հ踦 ���غ���!");
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
		
	}
	
}
