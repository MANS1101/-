package chap_01;

public class _05_VariableNaming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 ���� �̸� ���� ��
//		 1. ������ ���� ��︮�� �̸�
//		 2. ����(_), ����(abcABC), ����(123) ��� ���� (���� ��� �Ұ�)
//		 �ٸ����� ����鵵 �� �� �ֱ� ������ �ѱ��� ��� X
//		 3. ���� �Ǵ� ���ڷ� ���� ����
//		 4. �� �ܾ� �Ǵ� 2�� �̻� �ܾ��� ����
//		 5. �ҹ��ڷ� ����, �� �ܾ��� ���� ���ڴ� �빮�� (ù �ܾ�� ����)
//		 6. ����� ��� �Ұ� (public, static, void, int, double, ...)
		
//		 �Ա� �Ű� (����)
		String nationality = "���ѹα�"; // ����
		String firstName = "�浿"; // �̸�
		String lastName = "ȫ"; // ��
		String dateOfBirth = "2002-12-31"; // �������
		String flightNo = "KE707";
		String _flightNo = "KE707";
//		String -flightNo = "KE707"; = �ҹ��� or ����ٷ� �����ؾ���
		
		String item1 = "�ð�";
		String item2 = "����";
//		String 3item = "�����е�"; = ���ڷ� ���� X
		
//		���α׷��� �帧�� ���� ���Ǵ� ��� �� (ũ�� �̸��� �߿����� ���� ��)
		int i = 0;
		String s = "";
		String str = "";
		
//		���� ������ �ʴ� �� (���) ��� ���ڸ� �빮�ڷ� �ۼ�
		final String CODE = "KR";
//		CODE = "US";
		System.out.println(CODE);
	}

}