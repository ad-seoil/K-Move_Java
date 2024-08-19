package chapter14.exception;

public class C114_exception1 {

	public static void main(String[] args) {
		// - 예외처리 (Exception handling) 이란
		//	 프로그램 실핼시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
		//	 프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것
		// - 프로그램 오류
		//	 1. 컴파일 오류 (compile-time error)
		//		컴파일 시점에서 발생되는 에러
		//	 2. 런타임 에러 (runtime error)
		//		실행 중 발생되는 에러( 문법에는 맞아 컴파일은 됐지만
		//		실제로는 JVM이 코드를 실행할 때 문제가 발생)
		//	 3. 논리적 에러 (logical error)
		//		작성 의도와 다르게 동작

		int a, b, c;
		a = 2;
		b = 0;
//		c = a / b;
//		System.out.println("c = " + c);
//		
//		System.out.println("프로그램 실행 완료");
		
		
		// 1차적인 예외처리
		// 막을 수는 있지만 완벽하진 않음
//		if (b != 0) {
//			c = a / b;
//			System.out.println("c = " + c);
//		}
		
		
		
		try {
			c = a / b;
			System.out.println("c = " + c);
		} catch (Exception err) {
			err.printStackTrace();
			System.out.println("0으로 나눌 수 없습니다");
		}
		
		System.out.println("프로그램 실행 완료");
		
		
		
		
		
		
		
	}

}
