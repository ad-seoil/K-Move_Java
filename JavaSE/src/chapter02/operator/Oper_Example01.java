package chapter02.operator;

import java.util.Scanner;

public class Oper_Example01 {

	public static void main(String[] args) {
		// 상품가격과 받은 금액을 입력받아 거스름돈 출력
		// 출력 결과
		// 받은 금액 : 10000
		// 상품 가격 : 1500
		// 거스름돈 : 8500
		
		// 입력
		Scanner sc = new Scanner(System.in);
//		Scanner scan;	// 객체
//		scan = new Scanner(System.in);	// 인스턴스화
		// scan은 Scanner 클래스의 '인스턴스' (객체를 메모리에 할당)
		
		System.out.print("받은 금액 : ");
		int money = sc.nextInt();
		System.out.print("상품 가격 : ");
		int cost = sc.nextInt();
		
		// 출력
		System.out.println("==============================");
		System.out.println("받은 금액 : " + money);
		System.out.println("상품 가격 : " + cost);
		System.out.println("거스름돈 : " + (money - cost));
		
		
		
		
		
	}

}
