package chap_01;

public class _03_Variables {
	public static void main(String[] args) {

//		String name;
//		name = "ȫ�浿";
		
		String name = "ȫ�浿";
		int hour = 15;
		
		System.out.println(name + "�� ����� ���۵˴ϴ�. " + hour + "�ÿ� �湮 �����Դϴ�.");
		System.out.println(name + "�� ����� �Ϸ�Ǿ����ϴ�.");
		
//		System.out.println("ȫ�浿�� ����� ���۵˴ϴ�. 15�ÿ� �湮 �����Դϴ�.");
//		System.out.println("ȫ�浿�� ����� �Ϸ�Ǿ����ϴ�.");
		
		double score = 90.5;
		char grade = 'A';
		name = "�����";
		System.out.println(name + "���� ��� ������ " + score + "���Դϴ�.");
		System.out.println(name + "���� ������ " + grade + "�Դϴ�.");
		
		boolean pass = true; // true or false
		System.out.println("�̹� ���迡 ����������? " + pass);
		
		double d = 3.14123456789;
//		float f = 3.14;
		float f = 3.14123456789F;
		System.out.println(d);
		System.out.println(f);
		
//		int i = 1000000000000; -21�� ~ 21��
		long l = 1000000000000L;
		l = 1_000_000_000_000L;
		System.out.println(l);
		
//		int, long, float, double, char, String, boolean
	}
}