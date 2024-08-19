package chapter14.exception;

import java.util.Scanner;

public class C122_autoclose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("입력 : ");
			int num = sc.nextInt();
			System.out.println(num);
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외 처리");
		} finally {
			sc.close();
			
		}
		
//		sc.close();
		
	}

}
