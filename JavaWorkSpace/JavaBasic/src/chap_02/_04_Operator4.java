package chap_02;

public class _04_Operator4 {

	public static void main(String[] args) {
	
		// �� ������
		boolean ��ġ� = true;
		boolean ������� = true;
		boolean �������� = true;
		
		System.out.println(��ġ� || ������� || ��������); // �ϳ��� true �̸� true
		System.out.println(��ġ� && ������� && ��������); // ��� true �̸� true
		System.out.println();
		
		// And ����
		System.out.println((5 > 3) && (3 > 1)); // true && true = true
		System.out.println((5 > 3) && (3 < 1)); // true && false = false
		System.out.println();
		// Or ����
		System.out.println((5 > 3) || (3 > 1)); // true && true = true
		System.out.println((5 > 3) || (3 < 1)); // true && false = true
		System.out.println((5 < 3) || (3 < 1)); // false && false = false
		System.out.println();
		
//		System.out.println(1 < 3 < 5); ����� �� ���� �ڵ�
		
		// �� ���� ������
		System.out.println(!true);
		System.out.println(!false);
		System.out.println();
		
		System.out.println(!(5 == 5)); // false
	}
	
}
