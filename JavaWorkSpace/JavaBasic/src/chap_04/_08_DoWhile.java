package chap_04;
public class _08_DoWhile {
	public static void main(String[] args) {
		// �ݺ��� Do While 
		
		int distance = 25;
		int move = 0;
		int height = 2;
		while (move + height < distance) {
			System.out.println("�����⸦ ��� �մϴ�.");
			System.out.println("��ü �̵� �Ÿ� : " + move);
			move += 3;
		}
		System.out.println("�����߽��ϴ�.");
		
		height = 2;
		while (move + height < distance) {
			System.out.println("�����⸦ ��� �մϴ�.");
			System.out.println("��ü �̵� �Ÿ� : " + move);
			move += 3;
		}
		System.out.println("�����߽��ϴ�.");
		
		do {
			System.out.println("�����⸦ ��� �մϴ�.");
			System.out.println("��ü �̵� �Ÿ� : " + move);
			move += 3;
		} while (move + height < distance);
		System.out.println("�����߽��ϴ�.");
	}
}
