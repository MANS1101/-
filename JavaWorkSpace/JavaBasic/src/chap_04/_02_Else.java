package chap_04;

public class _02_Else {

	public static void main(String[] args) {
		
		// ���ǹ� IF Else
		int hour = 10;
		
		if (hour < 14) { // 14�� ������ �湮���� ���
			System.out.println("���̽� �Ƹ޸�ī�� +1");
		} else { // �� ���� ���
			System.out.println("�� �߰�!");
		}
		System.out.println("Ŀ�� �ֹ� �Ϸ� #1");
		
		boolean morningCoffee = true;
		if (hour >= 20 || morningCoffee ) System.out.println("���̽� �Ƹ޸�ī��(��ī����)");
		else System.out.println("���̽� �Ƹ޸�ī��!");
		System.out.println("Ŀ�� �ֹ� �Ϸ� #2");
	}
	
}
