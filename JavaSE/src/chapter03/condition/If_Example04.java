package chapter03.condition;

import java.util.Scanner;

public class If_Example04 {

	public static void main(String[] args) {
		// 등급 나누기
		// 점수 (0~100 사이의 정수)를 입력받아 등급을 출력한다
		// 등급은 수(90~100), 우(80~90), 미(70~80), 양(60~70), 가(60 미만) 로 구분한다
		// 단, 0 ~ 100 이외의 숫자를 입력시 " 잘못 입력했습니다" 문구를 출력하고 프로그램을 종료한다
		// 출력결과
		// 점수 입력 : 87
		// 우
		
		
		// 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		String rank = "";
		
		// 계산
		if (0 <= score && score <= 100) {
			if ( 90 <= score && score <= 100) {
				rank = "수";
			} else if (80 <= score && score < 90) {
				rank = "우";
			} else if (70 <= score && score < 80) {
				rank = "미";
			} else if (60 <= score && score < 70) {
				rank = "양";
			} else if (score < 60) {
				rank = "가";
			}
		} else {	// 0~100사이의 수가 아닐때
			System.out.println("잘못 입력했습니다");
			System.exit(0);		// 실행 중인 프로그램 종료
		}
		

		// 출력
		System.out.println(rank);
		
		

	}

}
