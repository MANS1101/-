package chap_06;

public class _02_Parameter {
	
	// power �޼ҵ�� int�� Ÿ���� ���� ȣ��� �� ���� �Ѿ�;� �Ѵ�.
	public static void power(int number) { // parameter, �Ű�����
		int result = number * number;
		System.out.println(number + "�� 2�������� " + result);
	}
	
	public static void powerByExp(int number, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result = result * number;
		}
		System.out.println(number + "��" + exponent + "�������� " + result);
	}
	public static void main(String[] args) {
		power(2); // �Լ��ȿ� ���� ���ڰ��̶����
		power(5); // �Լ��ȿ� ���� ���ڰ��̶����
		
		powerByExp(3, 5);
		powerByExp(2, 4);
	}
	
}
