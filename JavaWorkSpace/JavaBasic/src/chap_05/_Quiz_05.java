package chap_05;

// �Ź߰��Կ� ������ ��� �Ź���
// 250���� 300���� 5������ �����ϴ� ����� ������.

// �迭�� �ݺ����� ����Ͽ�,
// sizeArray ��� �迭�� ������ ���� ��� �ְ� ����ϴ� �ڵ带 �ۼ��Ͻÿ�.

public class _Quiz_05 {

	public static void main(String[] args) {
		
		int[] sizeArray = new int[11];
		
		for (int i = 0; i < sizeArray.length; i++) {
			sizeArray[i] = 250 + (5 * i);
		}
		
		for (int i = 0; i < sizeArray.length; i++) {
			System.out.println("������ " + sizeArray[i]);
		}

	}

}