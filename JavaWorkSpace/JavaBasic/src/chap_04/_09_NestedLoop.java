package chap_04;

public class _09_NestedLoop {

	public static void main(String[] args) {
		
		// ���� �ݺ���
		
		// ��(*) �簢�� �����
		
//		*****
//		*****
//		*****
//		*****
//		*****
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=============");
		
//		*
//		**
//		***
//		****
//		*****
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		     *
//		    **
//		   ***
//		  ****
//		 *****
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
