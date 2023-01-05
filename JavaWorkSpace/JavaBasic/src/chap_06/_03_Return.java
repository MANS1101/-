package chap_06;

public class _03_Return {
	
	public static String getPhoneNumber(){
		String phoneNumber = "02-1234-5678";
		return phoneNumber;
	}
	
	public static String getAddr() {
		return "서울시 강남구";
	}
	public static void main(String[] args) {
		// 반환값, return
		// void : 리턴값이 없음을 나타냄.
		String contactNumber = getPhoneNumber();
		System.out.println("호텔 전화번호 : " + contactNumber);
		System.out.println("호텔 주소 : " + getAddr());
	}

}
