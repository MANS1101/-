package chap_04;

public class _10_Break {

	public static void main(String[] args) {
		
		// Break
		// ġŲ ������ ���� 20������ �Ǹ� (1�δ� 1������ ���� ����)
		// �մ��� 50���� ���
		
		// for��
		int max = 20;
		for (int i = 1; i <= 50; i++) {
			System.out.println(i+"�� �մ�, �ֹ��Ͻ� ġŲ ���Խ��ϴ�.");
			if (i == max) {
				System.out.println("���� ��ᰡ ��� �����Ǿ����ϴ�.");
				break;
			}
		}
		
		// while��
		int index = 1;
		
		while (true) {
			System.out.println(index + "��° ���Դϴ�.");
			if (index == max) {
				System.out.println("���� ������ ��������Դϴ�.");
				break;
			}
			index++;
		}
	}

}
