package chap_02;

public class _05_Operator5 {

	public static void main(String[] args) {

		// ���� ������
		// ��� = (����) ? (���� ��� �����) : (������ ��� �����)
		
		int x = 8;
		int y = 10;
		int max = (x > y) ? x : y;
		System.out.println(max);
		
		int min = (x < y) ? x : y;
		System.out.println(min);
		
		boolean equal = (x == y) ? true : false;
		System.out.println(equal);
		
		String s = (x != y) ? "�ٸ���" : "����";
		System.out.println(s);
	}
	
}