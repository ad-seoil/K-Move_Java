package chapter01.data;

import java.util.Scanner;

public class Example01 {
	
	public static void main(String[] args) {
		// 스캐너 클래스 생성
		Scanner scan = new Scanner(System.in);
//		타입		변수명 = 객체의 주소값;
//		int     num  = 0;
		
		// 정수, 실수, 문자열 입력 받을 변수 초기화
		int num = 0;
		double num2 = 0;
		String str = "";
		
		// 키보드로 입력받기
		System.out.println("정수를 입력해주세요");
		num = scan.nextInt();
		System.out.println("실수를 입력해주세요");
		num2 = scan.nextDouble();
		System.out.println("문자열을 입력해주세요");
		str = scan.next();
		
		// 입력값 출력
		System.out.println("입력한 정수 : " + num);
		System.out.println("입력한 실수 : " + num2);
		System.out.println("입력한 문자열 : " + str);
		
	}

}
