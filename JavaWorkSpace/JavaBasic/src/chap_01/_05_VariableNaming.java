package chap_01;

public class _05_VariableNaming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 변수 이름 짓는 법
//		 1. 저장할 값에 어울리는 이름
//		 2. 밑줄(_), 문자(abcABC), 숫자(123) 사용 가능 (공백 사용 불가)
//		 다른나라 사람들도 볼 수 있기 때문에 한국어 사용 X
//		 3. 밑줄 또는 문자로 시작 가능
//		 4. 한 단어 또는 2개 이상 단어의 연속
//		 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
//		 6. 예약어 사용 불가 (public, static, void, int, double, ...)
		
//		 입국 신고서 (여행)
		String nationality = "대한민국"; // 국적
		String firstName = "길동"; // 이름
		String lastName = "홍"; // 성
		String dateOfBirth = "2002-12-31"; // 생년월일
		String flightNo = "KE707";
		String _flightNo = "KE707";
//		String -flightNo = "KE707"; = 소문자 or 언더바로 시작해야함
		
		String item1 = "시계";
		String item2 = "가방";
//		String 3item = "아이패드"; = 숫자로 시작 X
		
//		프로그램의 흐름을 위해 사용되는 경우 등 (크게 이름이 중요하지 않을 떄)
		int i = 0;
		String s = "";
		String str = "";
		
//		절대 변하지 않는 값 (상수) 모든 문자를 대문자로 작성
		final String CODE = "KR";
//		CODE = "US";
		System.out.println(CODE);
	}

}