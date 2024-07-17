package chapter02.operator;

public class C015_Operator2 {

	public static void main(String[] args) {
		// 증감 연산자
		int value = 2;
		int a = ++value;
		System.out.println("value = " + value + ", a = " + a);
		
		value = 2;
		a = value++;
		System.out.println("value = " + value + ", a = " + a);
		
		// 부호 연산자
		int value2 = 8;
		System.out.println(value2);
		value2 = -value2;
		System.out.println(value2);
		
		// 문자열 연산
		System.out.println(4 + 5);
		System.out.println("홍길동" + "고길동");
		System.out.println("응답하라" + 1999);
		
		double root = 1.414;
		System.out.println("2의 제곱근 : " + root);
		
		
		
		
	}

}
