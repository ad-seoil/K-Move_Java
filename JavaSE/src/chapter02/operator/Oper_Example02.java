package chapter02.operator;

import java.util.Scanner;

public class Oper_Example02 {

	public static void main(String[] args) {
		// 과목 3개의 점수를 입력받아 점수에 따른 합격 여부를 출력한다
		// 합격 조건 : 
		// 1. 3과목의  평균점수가 60점 이상일 것
		// 2. 한 과목이라도 40점 미만일 경우 과락으로 불합격
		// 출력결과:
		// 국어: 80
		// 영어: 80
		// 수학: 35
		// 합격여부: false
		
		
		// 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int lang = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
				
		// 계산
		// 1. 3과목의 평균점수가 60점 이상일 것
		double avg;
		avg = (lang + eng + math) / 3;
		
		// 2. 한 과목이라도 40점 미만일 경우 과락으로 불합격
//		boolean unpass = (lang > 40) && (eng > 40) && (math > 40) ? true : false;
//		boolean result = unpass && (sum >= 60) ? true : false;
		
		boolean result = (avg >= 60) && (lang >= 40) && (eng >= 40) && (math >= 40) ? true : false;
		
		// 출력
		System.out.println("합격여부 : " + result);
		
		
		

	}

}
