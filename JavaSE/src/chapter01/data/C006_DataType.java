package chapter01.data;

public class C006_DataType {

	public static void main(String[] args) {
		// [ 데이터 타입 ]
		// 1. 기본형 데이터타입
		// 	 - 정수형
		//		byte(1), short(2), int(4), long(8)
		//		char(2) = 정수형, 문자형
		//	 - 실수형
		//		float(4), double(8)
		// 	 - 논리형
		//		boolean(1)
		// 2. 참조형 데이터타입
		// 	 - 기본형 데이터타입이 아닌 모든 "객체"
		// 		class, enum, array, interface...
		
		// 기본형 데티어타입
		byte a = 127;
		short b = 12345;
		int c = 1234567890;
		long d = 1234567890000l;	// l or L 을 표시
		long d2 = 123456;			// int의 범위를 넘지 않으면 표시할 필요 x
		char e = 'A';				// 문자하나
		float f = 3.14f;			// f or F을 표시
		double g = 3.14;			
		boolean h = true;			// true or false
		
		var v1 = 'B';
		var v2 = 123;
		String s = "안녕하세요"; 		// 문자열 데이터타입
		String n = null;			
		
		System.out.println("byte : " + a);
		System.out.println("short : " + b);
		System.out.println("int : " + c);
		System.out.println("long : " + d);
		System.out.println("long : " + e);
		System.out.println("char : " + f);
		System.out.println("float : " + g);
		System.out.println("double : " + h);
		System.out.println("var : " + v1);
		System.out.println("var : " + v2);
		System.out.println("String : " + s);
		System.out.println("String : " + n);
		
		System.out.println("=======================================");
		
		// 문자형 타입의 정수화
		char alpha = 'A';
		System.out.println(alpha);
		
		char ch1 = 'A';
		System.out.println(alpha);
		System.out.println((int)ch1);
		
		// 정수형 타입의 문자화
		char ch2 = 66;
		System.out.println(ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		
		
		

	}

}
