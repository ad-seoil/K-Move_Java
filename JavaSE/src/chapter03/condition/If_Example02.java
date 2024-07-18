package chapter03.condition;

import java.util.Scanner;

public class If_Example02 {

	public static void main(String[] args) {
		// 새 파일 생성 단축키 : ctrl + n
		// main 생성 :tab + v
		
		// 3개의 정수를 입력받아
		// if문을 활용하여 가장 큰 수를 출력한다
		// 출력 결과
		// 숫자 1 : 3
		// 숫자 2 : 1
		// 숫자 3 : 2
		// 최대값 = 3
		
		
		// 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 1 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자 2 : ");
		int num2 = sc.nextInt();
		System.out.print("숫자 3 : ");
		int num3 = sc.nextInt();
		
//		int num1 = 3;
//		int num2 = 1;
//		int num3 = 2;
		
		
		// 계산
		int max = 0;
		
		// 상대적으로 가독성은 떨어지지만 유지보수하기는 더 좋아보이는 식
//		if (num1 > num2) {
//			if (num1 > num3) {
//				max = num1;
//			} else if (!(num1 > num3)) {
//				max = num3;
//			}
//		} else if (!(num1 > num2)) {
//			if (num2 > num3) {
//				max = num2;
//			} else if (!(num2 > num3)) {
//				max = num3;
//			}
//		}
		
		// 보기는 쉽지만 유지보수하긴 더 힘들어보이는 식
//		if (num1 > num2 && num1 > num3) {
//			max = num1;
//		} else if (num2 > num1 && num2 > num3) {
//			max = num2;
//		} else if (num3 > num1 && num3 > num1) {
//			max = num3;
//		}
		
		max = num1;
		if (max < num2) {
			max = num2;
		}
		if (max < num3) {
			max  = num3;
		}
		
		
		// 출력
		System.out.println("최대값 = " + max);
		
		
		
		
		
		
	}

}
