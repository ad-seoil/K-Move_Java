package chapter01.data;

public class C007_Constant {
	
	public static void main(String[] args) {
		// 상수
		// final 지정자가 붙으면 초기식을 반드시 주어야 함
		// 값 변경 x
		final double RATE = 3.28;
//		RATE = 6.66;	// 변경 불가
		System.out.println("이자율 : " + RATE + "%");
		int deposit = 10000;
		System.out.println("1년 후 이자 : " + deposit * RATE / 100 + "원");
		
		// 리터럴
		// 변수에 대입되거나 수식에 직접 사용되는 숫자값
		final double PI = 3.14;		// PI = 상수, 3.14 = 리터럴
		int num = 10000;			// num = 변수, 10000 = 리터럴
		
		
		
		
		
		
	}
}
