package chap_06;

public class _05_Overloading {
			// Over���̵�  <- 2�г⶧ ���
	public static int getPower(int number) {
		int result = number * number;
		return result;
	}
	
	public static int getPower(String strnumber) {
		int number = Integer.parseInt(strnumber);
		return number * number;
	}
	
	public static int getPower(int number, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= number;
		}
		return result;
	}
	
	// �Է°��� ���� ������ ����� �����ϴ� ��� �޼��� �̸��� �Ȱ��� ���� ����� �� �ִµ�,
	// �Ʒ��� ������ ���Ѿ� �Ѵ�.
	// 1. ������ Ÿ���� �޶����. 
	// 2. �Ķ������ ���� �޶�� ��.
	
	// �̰��� �޼ҵ� �����ε��̶�� �Ѵ�.
	
	public static void main(String[] args) {
		System.out.println(getPower(4));
		System.out.println(getPower("9"));
		System.out.println(getPower(5, 4));
	}
	
}
