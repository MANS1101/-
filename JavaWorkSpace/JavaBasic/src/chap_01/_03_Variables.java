package chap_01;

public class _03_Variables {
	public static void main(String[] args) {

//		String name;
//		name = "홍길동";
		
		String name = "홍길동";
		int hour = 15;
		
		System.out.println(name + "님 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
		System.out.println(name + "님 배송이 완료되었습니다.");
		
//		System.out.println("홍길동님 배송이 시작됩니다. 15시에 방문 예정입니다.");
//		System.out.println("홍길동님 배송이 완료되었습니다.");
		
		double score = 90.5;
		char grade = 'A';
		name = "장발장";
		System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
		System.out.println(name + "님의 학점은 " + grade + "입니다.");
		
		boolean pass = true; // true or false
		System.out.println("이번 시험에 통과했을까요? " + pass);
		
		double d = 3.14123456789;
//		float f = 3.14;
		float f = 3.14123456789F;
		System.out.println(d);
		System.out.println(f);
		
//		int i = 1000000000000; -21억 ~ 21억
		long l = 1000000000000L;
		l = 1_000_000_000_000L;
		System.out.println(l);
		
//		int, long, float, double, char, String, boolean
	}
}