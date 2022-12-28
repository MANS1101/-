package chap_01;

public class _Quiz_01 {

	public static void main(String[] args) {
		
//		버스 번호 (1234, 상암08, ...)
//		문자형
		String busNum = "1234";
//		남은 시간 (3, 5, 7, ...)
//		정수형
		int minute = 3;
//		남은 거리 (1.5, 0.8, 2.0, ...)
//		실수형
		double distance = 1.5;
		
		System.out.println(busNum+"번 버스");
		System.out.println("약 " + minute+"분 후 도착");
		System.out.println("남은 거리 " + distance +"km");
	}

}