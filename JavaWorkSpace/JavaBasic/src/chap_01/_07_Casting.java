package chap_01;

public class _07_Casting {
	
	public static void main(String[] args) {
		
//		����ȯ (Casting)
//		���������� �Ǽ������� 
//		�Ǽ������� ����������
		
//		int score = 93 + 98.8;
		
//		int to float, double 
		int score = 93;
		System.out.println(score);
		System.out.println((float)score);
		System.out.println((double)score);
		
//		float, double to int (���� �ս��� �߻��� �� ����)
		float score_f = 93.3F;
		double score_d = 98.8;
		System.out.println((int)score_f);
		System.out.println((int)score_d);
		
//		ctrl + m : �ڵ�����â Ȯ��
		
//		������ �Ǽ��� ����
		score = 93 + (int)98.8; // 93 + 98
		System.out.println(score);
		
		score_d = 93 + 98.8; // ���� ũ���� ������ Ÿ�Կ��� ū ũ���� ������ Ÿ������ ������ �ڵ����� �̷������.
		
		double convertedScoreDouble = score;
//		int -> long -> float -> double (�ڵ� ����ȯ, ������ ����ȯ)
		
		int convertedScoreInt = (int)score_d;
//		double -> float -> long -> int (���� ����ȯ, ����� ����ȯ)
		
//		���ڸ� ���ڿ���
		String s1 = String.valueOf(93); // String�� ������ ����
		s1 = Integer.toString(100); // ���ڸ� ���ڿ���
		
	}
}
