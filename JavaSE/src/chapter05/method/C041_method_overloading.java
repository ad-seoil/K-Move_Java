package chapter05.method;

public class C041_method_overloading {

	public static void main(String[] args) {
		// 오버로딩(overloading) - ex. print 메서드
		// 하나의 이름으로 여러 처리를 한다
		// 1. 메서드의 이름이 같아야 함(필수)
		// 2. 파라미터의 개수가 달라야 함
		// 3. 파라미터의 데이터 타입이 달라야 함
		// 4. 파라미터의 순서가 달라야 함

		getMax(5);
		getMax(6, 3.14);
		getMax(3.14, 6);
		System.out.println("[3, 6] = " + getMax(3, 6));
		System.out.println("[0.322, 0.606] = " + getMax(0.322, 0.606));
		
		
		
	}

	
	static void getMax(int a) {
		System.out.println(a);
	}
	
	// 파라미터 개수차이
	static void getMax(int a, double b) {
		System.out.println(a + b);
	}
	
	// 파라미터 순서 차이
	static void getMax(double a, int b) {
		System.out.println(a * b);
	}
	
	// 파라미터 타입 차이
	static int getMax(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	// 파라미터 타입 차이
	static double getMax(double a, double b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	
	
	
	
	
	
}
