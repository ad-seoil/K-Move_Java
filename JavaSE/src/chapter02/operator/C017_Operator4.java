package chapter02.operator;

import java.util.Scanner;

public class C017_Operator4 {
	
	public static void main(String[] args) {
		// 삼항 연산자 & 조건 연산자
		//  조건식 ? 결과1 : 결과2
		// version1
		int fatherAge = 45;
		int motherAge = 47;
		
		String result = (fatherAge > motherAge) ? "아빠가 연상" : "엄마가 연상";
		System.out.println(result);
		
		System.out.println("===========================");
		
		// version2
		// 입력을 통해 나이 비교
		// 입력받기 위한 scan
		Scanner sc = new Scanner(System.in);
		System.out.print("아빠의 나이 : ");
		fatherAge = sc.nextInt();
		System.out.print("엄마의 나이 : ");
		motherAge = sc.nextInt();
		
		result = (fatherAge > motherAge) ? "아빠가 연상" : "엄마가 연상";
		System.out.println(result);
		
		
	}
}
