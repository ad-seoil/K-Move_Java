package chapter04.loop;

import java.util.Scanner;

public class Loop_Example03 {

	public static void main(String[] args) {
		// 합 구하기
		// 2개의 정수를 입력받아 입력받은 정수를 포함한 사이값들의 총합을 구하시오
		// 단, 입력 순서에 상관없이 합을 구할 것
		
		// 출력 결과
		// 숫자 입력: 5			숫자 입력: 10
		// 숫자 입력: 10			숫자 입력: 5
		// 45					45
		
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		System.out.print("숫자 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("숫자 입력 : ");
		int num2 = scan.nextInt();

		if (num1 < num2) {
			for ( ; num1 <= num2; num1++) {
//				System.out.println(num1);
				sum += num1;
			}
			System.out.println(sum);
		} else if (num1 > num2) {
			for ( ; num2 <= num1; num2++) {
				sum += num2;
			}
			System.out.println(sum);
		}
		
		
		
		
		
		
		
		
		
	}

}
