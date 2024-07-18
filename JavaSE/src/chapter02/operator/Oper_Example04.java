package chapter02.operator;

import java.util.Scanner;

public class Oper_Example04 {

	public static void main(String[] args) {
		// 정수 3개를 입력받아 각 변수 (kor, eng, math)에  값을 저장하고,
		// 총합 (sum)과 평균 (avg)를 출력하세요
		//  - 평균값은 소수점은 포함한 점수로 출력할 것
		
		// 출력 결과
		// kor 점수 : 80
		// eng 점수 : 75
		// math 점수 : 35
		// 총합 : 190, 평균 : 63.333333333336
		
		
		// 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("kor 점수 : ");
		double kor = sc.nextDouble();
		System.out.print("eng 점수 : ");
		double eng = sc.nextDouble();
		System.out.print("math 점수 : ");
		double math = sc.nextDouble();
		
//		kor = 80;
//		eng = 75;
//		math = 35;
		
		// 계산
		int sum = (int)(kor + eng + math);
		double avg = (double)sum / 3;
//		double avg = sum / 3.0;
		
		// 출력
		System.out.println("총합 : " + sum + ", 평균 : " + avg);
		
		
		
		
		
		
		
	}

}
