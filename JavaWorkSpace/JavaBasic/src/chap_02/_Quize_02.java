package chap_02;

public class _Quize_02 {

	public static void main(String[] args) {
		
		int centimeter = 115;
		String result;
		
		result = 
			(centimeter >= 120) ? "탑승 가능합니다." : "탑승 불가능합니다."; // 탑승 여부는 변수
		System.out.println("키가 "+ centimeter +"cm "+"이므로 "+result); // 키가 <- 부분은 상수
	}

}
