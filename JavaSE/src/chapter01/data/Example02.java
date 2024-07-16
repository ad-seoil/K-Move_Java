package chapter01.data;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		// 이름, 나이, 키를 입력받아 출력하세요
		
		
		// 입력받기 위한 스캐너
		Scanner sc = new Scanner(System.in);
		
		// 받을 정보에 대한 정의
		String name = "";	// 이름
		int age = 0;		// 나이
		double height = 0;	// 키
		
		// 입력
		System.out.println("값만 입력해주세요");
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("나이 : ");
		age = sc.nextInt();
		System.out.print("키 : ");
		height = sc.nextDouble();
		
		// 출력
		System.out.println("==========입력된 값==========");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height + "cm");
	}

}
