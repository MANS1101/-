package chap_05;

public class _02_ArrayLoop {

	public static void main(String[] args) {
		
		String[] coffees = {"�Ƹ޸�ī��", "ī���ī", "��", "īǪġ��"};
		
		// �迭�� ���� for���� ����Ͽ� ���
		for (int i = 0; i < 4; i++) {
			System.out.println(coffees[i] + " �ϳ�");
		}
		System.out.println("�ּ���.");
		System.out.println();
		
//		for�� �ȿ� �������� i�� ����ϴ� ������ ����� �� �˾Ƶξ�� ��
		
//		i = 0 : System.out.println(coffees[0]);
//		i = 1 :	System.out.println(coffees[1]);
//		i = 2 : System.out.println(coffees[2]);
//		i = 3 : System.out.println(coffees[3]);
//		i = 4 : ������ false�� �ݺ��� ����
		
		// �迭���� �ݺ����� ���� ��, �ݺ� Ƚ���� �����ڰ� ���� ���� �ʾƵ� ��!
		// �迭�̸�.length -> �迭�� ���̰��� ��������.
		for (int i = 0; i < coffees.length; i++) {
			System.out.println(coffees[i]);
		}
		System.out.println();
		
		// ���� for�� (for - each) �ݺ���
		for (String coffee : coffees) { 
			System.out.println(coffee);
		}
		
		
	}
	
}