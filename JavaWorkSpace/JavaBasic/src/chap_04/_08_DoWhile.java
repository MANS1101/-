package chap_04;
public class _08_DoWhile {
	public static void main(String[] args) {
		// 반복문 Do While 
		
		int distance = 25;
		int move = 0;
		int height = 2;
		while (move + height < distance) {
			System.out.println("발차기를 계속 합니다.");
			System.out.println("전체 이동 거리 : " + move);
			move += 3;
		}
		System.out.println("도착했습니다.");
		
		height = 2;
		while (move + height < distance) {
			System.out.println("발차기를 계속 합니다.");
			System.out.println("전체 이동 거리 : " + move);
			move += 3;
		}
		System.out.println("도착했습니다.");
		
		do {
			System.out.println("발차기를 계속 합니다.");
			System.out.println("전체 이동 거리 : " + move);
			move += 3;
		} while (move + height < distance);
		System.out.println("도착했습니다.");
	}
}
