package chap_06;

public class _Exam_06 {
	
	public static void gugudan(int dan) {
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * "+ i + " = " + dan*i);
		}
	}
	
	public static void gugudan(int dan, int num) {
		int danCopy;
		for (danCopy=dan; i <= num+1; danCopy++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(dan + " * " + j + " = " + dnaCopy*j);
			}
			dan += 1;
		}
	}
	
	
	public static void main(String[] args) {
		gugudan(2, 8);
	}

}
