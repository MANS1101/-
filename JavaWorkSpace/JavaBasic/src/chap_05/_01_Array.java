package chap_05;

public class _01_Array {

	public static void main(String[] args) {
		
//		2023. 01. 02
//		// array(배열) : 같은 자료형의 값 여러개를 저장하는 연속된 공간
//		
//		String coffeeRoss = "아메리카노";
//		String coffeeRachel = "카페모카";
//		String coffeeChandler = "라떼";
//		String coffeeMonica = "카푸치노";
//		
//		System.out.println(coffeeRoss + " 하나");
//		System.out.println(coffeeRachel + " 하나");
//		System.out.println(coffeeChandler + " 하나");
//		System.out.println(coffeeMonica + " 하나");
//		System.out.println("주세요");
//		
//		// 배열 선언 첫 번째 방법
//		String[] coffees = new String[4];
//		
//		coffees[0] = "아메리카노";
//		coffees[1] = "카페모카";
//		coffees[2] = "라떼";
//		coffees[3] = "카푸치노";
//		
//		// 배열 선언 두 번째 방법
//		String coffees2[] = new String[4];
		
		
//		2023. 01. 04
		String coffeeRoss = "아메리카노";
		String coffeeRachel = "카페모카";
		String coffeeChandler = "라떼";
		String coffeeMonica = "카푸치노";
		
		System.out.println(coffeeRoss + " 하나");
		System.out.println(coffeeRachel + " 하나");
		System.out.println(coffeeChandler + " 하나");
		System.out.println(coffeeMonica + " 하나");
		System.out.println("주세요");
		
		// 배열 선언 첫 번째 방법 
		String[] coffees = new String[4];
		// 배열 선언 두 번째 방법
		String coffees2[] = new String[4];
		
		coffees[0] = "아메리카노";
		coffees[1] = "카페모카";
		coffees[2] = "라떼";
		coffees[3] = "카푸치노";
		
		System.out.println(coffees[0] + " 하나");
		System.out.println(coffees[1] + " 하나");
		System.out.println(coffees[2] + " 하나");
		System.out.println(coffees[3] + " 하나");
		System.out.println("주세요");
		
		// 선언과 할당을 동시에
		String[] coffees3 = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};
		
		// 선언과 할당을 동시에2
		String[] coffees4 = {"아메리카노", "카페모카", "라떼", "카푸치노"};
		
		System.out.println(coffees4[0] + " 하나");
		System.out.println(coffees4[1] + " 하나");
		System.out.println(coffees4[2] + " 하나");
		System.out.println(coffees4[3] + " 하나");
		System.out.println("주세요");
		
		int[] i = new int[3];
		double[] d = {10.0, 11.2, 12.5};
		boolean[] b = {true, false, true};
		
		
		int num; // 선언
		num = 10; // 할당
		
		// 배열은 같은 자료형의 값 여러개를 저장하는 연속된 공간 이므로 
		// 변수명을 쓸 때 단수형이 아닌 복수형이므로 단어 뒤에 s를 붙여서 씀
		
	}

}