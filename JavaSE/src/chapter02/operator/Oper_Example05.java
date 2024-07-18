package chapter02.operator;

import java.util.Scanner;

public class Oper_Example05 {

	public static void main(String[] args) {
		// 정수 3개를 입력받아 각 변수 (a, b, c)에 값을 저장하고
		// 입력받은 값 중 최대값(max)를 측정하세요
		
		// 출력결과
		// 첫번째 정수 : 2
		// 두번째 정수 : 4
		// 세번째 정수 : 1
		// 최대값 : 4
		
		
		// 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 정수 : ");
		int num3 = sc.nextInt();
		
		// 계산
		int max = (num1 > num2) ? num1 : num2;
		max = (max > num3) ? max : num3;
		
		// int max = (num1 > num2 && num1 > num3) ? num1:(num2 > num3) ? num2 : num3
		
		// 출력
		System.out.println("최대값 : " + max);
		
		
		
		
		
		
	}

}
