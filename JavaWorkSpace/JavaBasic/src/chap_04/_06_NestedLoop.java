package chap_04;

public class _06_NestedLoop {

	public static void main(String[] args) {
		// ������ 2�� ���
		System.out.println("======= 2�� ��� =======");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("2 * %d = %d\n", i, i*2);
		}
		// ������ ��ü ���
		System.out.println("======= ������ ��ü =======");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, (i*j));
			}
			System.out.println();
		}
		// ������ ¦���ܸ� ���
		System.out.println("======= ¦���� =======");
		for (int i = 2; i <= 9; i+=2) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, (i*j));
			}
			System.out.println();
		}
		// ������ Ȧ���ܸ� ���
		System.out.println("======= Ȧ���� =======");
		for (int i = 1; i <= 9; i+=2) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, (i*j));
			}
			System.out.println();
		}
	}

}
