package chap_04;

import java.util.Scanner;

public class _07_While {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 반복문 While
		// 수영장에서 수영하는 모습
		int distance = 25;
		int move = 0;
		
		while(move < distance) {
			System.out.println("발차기를 계속 합니다.");
			System.out.println("현재 이동 거리 : " + move);
			move += 3;
		}
		System.out.println("도착했습니다.");
		
		// 무한루프
		int num = 0;
		
		while(true) {
			num = sc.nextInt();
			
			if (num == 9) {
				System.out.println("종료합니다.");
				break;
			}
			
			System.out.println("반복중");
		}
	}
	
}
