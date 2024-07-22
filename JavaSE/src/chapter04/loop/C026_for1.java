package chapter04.loop;

import java.util.Iterator;

public class C026_for1 {

	public static void main(String[] args) {
		
		System.out.println("1번 실행");
		System.out.println("2번 실행");
		System.out.println("3번 실행");
		System.out.println("4번 실행");
		System.out.println("5번 실행");
		
		// for
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "번 실행");
		}

		// 1부터 100 합
		int sum = 0;
		for (int i = 2; i <=100 ; i++) {
			sum += i;
		}
		System.out.println("1~100까지의 합 : " + sum);
		
		// 짝수 합
		sum = 0;
		for (int i = 2; i <=100 ; i+=2) {
			sum += i;
		}
		System.out.println("1~100까지의 짝수 합 : " + sum);
		
		
		
		
	}

}
