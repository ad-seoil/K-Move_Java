package chapter04.loop;

import java.util.Scanner;

public class C033_dowhile {

	public static void main(String[] args) {
		// do-while
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		
		do {
			System.out.print("숫자를 입력해주세요(종료는 0) : ");
			num = scan.nextInt();
			sum += num;
		} while (num != 0);
		System.out.println("총 합계 : " + sum);
		
		
		
		
		
		
		

	}

}
