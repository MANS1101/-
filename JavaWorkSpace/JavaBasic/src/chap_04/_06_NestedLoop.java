package chap_04;

public class _06_NestedLoop {

	public static void main(String[] args) {
		// 구구단 2단 출력
		System.out.println("======= 2단 출력 =======");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("2 * %d = %d\n", i, i*2);
		}
		// 구구단 전체 출력
		System.out.println("======= 구구단 전체 =======");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, (i*j));
			}
			System.out.println();
		}
		// 구구단 짝수단만 출력
		System.out.println("======= 짝수단 =======");
		for (int i = 2; i <= 9; i+=2) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, (i*j));
			}
			System.out.println();
		}
		// 구구단 홀수단만 출력
		System.out.println("======= 홀수단 =======");
		for (int i = 1; i <= 9; i+=2) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, (i*j));
			}
			System.out.println();
		}
	}

}
