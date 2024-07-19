package chapter03.condition;

import java.util.Random;
import java.util.Scanner;

public class Switch_Example01 {

	public static void main(String[] args) {
		// 간단한 사칙연산 계산기
		// 점수 2개와 연산자 (+, -, *, /)를 입력받아 결과를 출력한다
		// 단,  분모가 0일경우 "0으로 나눌 수 없습니다"를 출력한다
		
		// 출력결과
		// 연산자 (+, -, *, /) : /
		// 정수1 입력: 3
		// 정수2 입력: 0
		// 0으로 나눌 수 없습니다

		
		// 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자( +, -, *, / ) : ");
		String oper = sc.next();
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		
//		Random random = new Random();
//		int num1 = random.nextInt();
//		System.out.println(num1);
//		int num2 = random.nextInt();
//		System.out.println(num2);
		int result = 0;
		
		// 계산
		switch (oper) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다");
					System.exit(0);
				} else {
					result = num1 / num2;
				}
				break;
		}
		
		
		// 출력
		System.out.println("결과 : " + result);
		
		
	}

}
