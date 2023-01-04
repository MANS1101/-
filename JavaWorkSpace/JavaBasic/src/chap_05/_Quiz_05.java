package chap_05;

// 신발가게에 들어오는 모든 신발은
// 250부터 300까지 5단위씩 증가하는 사이즈를 가진다.

// 배열과 반복문을 사용하여,
// sizeArray 라는 배열에 사이즈 값을 모두 넣고 출력하는 코드를 작성하시오.

public class _Quiz_05 {

	public static void main(String[] args) {
		
		int[] sizeArray = new int[11];
		
		for (int i = 0; i < sizeArray.length; i++) {
			sizeArray[i] = 250 + (5 * i);
		}
		
		for (int i = 0; i < sizeArray.length; i++) {
			System.out.println("사이즈 " + sizeArray[i]);
		}

	}

}