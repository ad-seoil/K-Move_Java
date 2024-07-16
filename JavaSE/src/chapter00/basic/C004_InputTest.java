package chapter00.basic;

import java.util.Scanner;

public class C004_InputTest {

	public static void main(String[] args) {
		// 출력
		System.out.println("출력을 도와주는 메서드");
		
		// 입력
		Scanner scan = new Scanner(System.in);
		// import = 코드를 가져오겠다 
		// ctrl + shift + M or O
		
		System.out.println("byte : ");
		byte a = scan.nextByte();	// byte a = 값; = 초기화
		System.out.println("short : ");
		short b = scan.nextShort();
		System.out.println("int : ");
		int c = scan.nextInt();			// 1
		System.out.println("long : ");
		long d = scan.nextLong();
		System.out.println("float : ");
		float e = scan.nextFloat();
		System.out.println("double : ");
		double f = scan.nextDouble();	// 2
		System.out.println("String : ");
		String g = scan.next();			// 3
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
		
		Scanner question = new Scanner(System.in);
		System.out.println("변수 테스트");
		String InputQuestion = scan.next();
		System.out.println(InputQuestion);
		
		
	}

}
