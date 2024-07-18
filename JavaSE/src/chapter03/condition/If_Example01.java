package chapter03.condition;

import java.util.Scanner;

public class If_Example01 {

	public static void main(String[] args) {
		// 사각형의 넓이 구하기
		// 가로, 세로의 길이를 입력받아 넓이는 구하시오
		// 단, 가로와 세로의 길이를 비교하여 정사각형 or 직사각형을 출력한다
		
		// 출력결과
		// 가로 입력: 5
		// 세로 입력: 4
		// '직사각형'의 넓이는 20입니다

		
		// 입력
		Scanner sc  = new Scanner(System.in);
		System.out.print("가로 입력 : ");
		int width = sc.nextInt();
		System.out.print("세로 입력 : ");
		int hight = sc.nextInt();
		
//		int width = 5;
//		int hight = 5;
		
		// 계산
		int area = width * hight;
		String shape = "";
		
		if (width == hight) {
			shape = "정사각형";
		} else if (width != hight) {
			shape = "직사각형";
		}
		
		
		// 출력
		System.out.println("'" + shape + "'" + "의 넓이는 " + area + "입니다");
		
		
		
		
	}

}
