package chap_01;

public class _07_Casting {
	
	public static void main(String[] args) {
		
//		형변환 (Casting)
//		정수형에서 실수형으로 
//		실수형에서 정수형으로
		
//		int score = 93 + 98.8;
		
//		int to float, double 
		int score = 93;
		System.out.println(score);
		System.out.println((float)score);
		System.out.println((double)score);
		
//		float, double to int (값의 손실이 발생할 수 있음)
		float score_f = 93.3F;
		double score_d = 98.8;
		System.out.println((int)score_f);
		System.out.println((int)score_d);
		
//		ctrl + m : 코드편집창 확대
		
//		정수와 실수의 연산
		score = 93 + (int)98.8; // 93 + 98
		System.out.println(score);
		
		score_d = 93 + 98.8; // 작은 크기의 데이터 타입에서 큰 크기의 데이터 타입으로 변경은 자동으로 이루어진다.
		
		double convertedScoreDouble = score;
//		int -> long -> float -> double (자동 형변환, 묵시적 형변환)
		
		int convertedScoreInt = (int)score_d;
//		double -> float -> long -> int (수동 형변환, 명시적 형변환)
		
//		숫자를 문자열로
		String s1 = String.valueOf(93); // String은 참조형 변수
		s1 = Integer.toString(100); // 문자를 숫자열로
		
	}
}
