package chap_06;

public class _03_Return {
	
	public static String getPhoneNumber(){
		String phoneNumber = "02-1234-5678";
		return phoneNumber;
	}
	
	public static String getAddr() {
		return "����� ������";
	}
	public static void main(String[] args) {
		// ��ȯ��, return
		String contactNumber = getPhoneNumber();
		System.out.println("ȣ�� ��ȭ��ȣ : " + contactNumber);
		System.out.println("ȣ�� �ּ� : " + getAddr());
	}

}
