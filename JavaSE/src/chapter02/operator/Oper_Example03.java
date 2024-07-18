package chapter02.operator;

import java.util.Scanner;

public class Oper_Example03 {

	public static void main(String[] args) {
		// 각 자리수의 합 구하기
		// 출력결과
		// 0~999 사이의 정수를 입력하세요:
		// 315
		// 각 자리수의 합: 9
		
		
		// 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("0~999 사이의 정수를 입력하세요 : ");
		int num = sc.nextInt();
//		int num = 315;
		
		// 계산
		// 100의 자릿수
		int hunNum = num / 100;
//		System.out.println(hunNum);
		
		// 10의 자릿수
		num -= hunNum * 100;
//		System.out.println(num);
		
		int tenNum = num / 10;
//		System.out.println(tenNum);
		
//		한번에 10의 자리수 구함
//		int num10 = num % 100 / 10;
		
		
		// 1의 자릿수
		num -= tenNum * 10;
//		System.out.println(num);
		
		// 한번에 1의 자리수 구함
//		int num1 = num % 100 % 10;
		
		// 출력
		int sum = hunNum + tenNum + num;
		System.out.println("각 자리수의 합 : " + sum);
		
		
		
		
		
		
		
		
	}

}
