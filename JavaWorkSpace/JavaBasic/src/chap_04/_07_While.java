package chap_04;

import java.util.Scanner;

public class _07_While {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// �ݺ��� While
		// �����忡�� �����ϴ� ���
		int distance = 25;
		int move = 0;
		
		while(move < distance) {
			System.out.println("�����⸦ ��� �մϴ�.");
			System.out.println("���� �̵� �Ÿ� : " + move);
			move += 3;
		}
		System.out.println("�����߽��ϴ�.");
		
		// ���ѷ���
		int num = 0;
		
		while(true) {
			num = sc.nextInt();
			
			if (num == 9) {
				System.out.println("�����մϴ�.");
				break;
			}
			
			System.out.println("�ݺ���");
		}
	}
	
}
