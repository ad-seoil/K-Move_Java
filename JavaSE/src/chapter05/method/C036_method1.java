package chapter05.method;

public class C036_method1 {

	public static void main(String[] args) {
		// 								 메서드 호출부
		System.out.println("1~10 = " + calcSum(1, 10));
		System.out.println("15~100 = " + calcSum(15, 100));

	}
	
	
	// 메서드 정의부
//	접근제어자			반환할 값의 타입		메서드 명		파라미터(매개변수 자료형	매개변수 자료명
	public 	static 		int 		calcSum		(	       int 			from, 		int to) {
		int sum = 0;
		for (int i = from; i <= to; i++) {
			sum += i;
		}
		return sum;
	}
	
	
	
	
	
	
	
	
	
	
	
}
