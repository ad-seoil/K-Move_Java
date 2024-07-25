package chapter05.method;

import java.util.Scanner;

public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printArea(100));
		System.out.println("넓이는 " + printArea(321, 606) + "cm^2");
		System.out.println("넓이는 " + printArea(3, 6.06) + "cm^2");
		System.out.println("넓이는 " + printArea(3.22, 6) + "cm^2");
		
		area(menu());
		
	}

	
	// 오버라이딩 
	// 기본 메서드
	static int printArea(int a) {
		return a;
	}
	
	// 1. 파라미터 갯수
	static double printArea(int a, int b) {
		return a*b;
	}
	
	// 2. 파라미터 타입
	static double printArea(int a, double b) {
		return a*b;
	}
	
	// 3. 파라미터 순서
	static double printArea(double a, int b) {
		return a*b;
	}
	

	static int menu() {
		System.out.println("***도형선택***");
		System.out.println("1. 삼각형");
		System.out.println("2. 원");
		System.out.println("3. 사다리꼴");
		System.out.println("4. 종료");
		Scanner scan = new Scanner(System.in);
		System.out.print("선택 : ");
		int choose = scan.nextInt();
		return choose;
	}
	
	static void area(int choose) {
		if (choose == 1) {
			triangle();
		} else if (choose == 2) {
			circle();
		} else if (choose == 3) {
			tripe();
		}
	}


	private static void tripe() {
		System.out.println("나는 사다리꼴!");
		
	}


	private static void circle() {
		System.out.println("나는 원!");
		
	}


	private static void triangle() {
		System.out.println("나는 삼각형!");
	}
	
	
	
}
