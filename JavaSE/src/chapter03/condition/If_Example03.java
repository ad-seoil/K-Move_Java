package chapter03.condition;

import java.util.Scanner;

public class If_Example03 {

	public static void main(String[] args) {
		// 정수를 1개 입력받고 홀수인지 짝수인지 출력
		// 출력결과
		// 정수 입력 : 4
		// 짝수입니다
		
		
		// 입력
		Scanner sc  = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		
		
		// 계산 	
//		if (num != 0) {
//			if (num % 2 == 0) {
//				System.out.println("짝수입니다");
//			} else if (num % 2 != 0) {
//				System.out.println("홀수입니다");
//			}
//		} else if (num == 0) {
//			System.out.println("0 제외 다른 값을 입력해주세요");
//		}
		
		
		// 출력
		String result = "홀수";
		if (num % 2 == 0) {
			result = "짝수";
		}
		System.out.println(result + "입니다");
		
		
		
		
		
		
		
	}

}
