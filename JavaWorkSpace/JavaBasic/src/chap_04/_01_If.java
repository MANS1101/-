package chap_04;

public class _01_If {

	public static void main(String[] args) {
		
		// ���ǹ� IF
		int hour = 10;
		
		// if�� ������ �ϳ��� ������ ������ �� { } ���� ����
		if (hour < 14) System.out.println("���̽� �Ƹ޸�ī�� +1");
		
		// if�� ������ 2�� �̻��� ������ ������ ���� { } ���� �Ұ�
		if (hour < 14) {
			System.out.println("���̽� �Ƹ޸�ī�� +1");
			System.out.println("�� �߰�!");
		}
		
		
		// ���� 2�� ����, ��� Ŀ�Ǹ� ������ ���� ���
		boolean morningCoffee = false; // ��� Ŀ��
		
		//if (hour < 14 && morningCoffee == false) {
		if (hour < 14 && !morningCoffee) {
			System.out.println("���̽� �Ƹ޸�ī�� +1");
		}
		
		// �湮Ƚ���� 10�� �湮 �� ������ ��ī�� ���� ����!!
		int numberVisits = 10;
		
		if (numberVisits % 10 == 0) System.out.println("��ī�� +1");
		
	}

}