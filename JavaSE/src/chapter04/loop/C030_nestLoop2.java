package chapter04.loop;

import java.util.Scanner;

public class C030_nestLoop2 {

	public static void main(String[] args) {
		// 숫자 맞추기
		Scanner scan = new Scanner(System.in);
		int num = (int) (Math.random()*10) + 1 ; // 1~10
		for (;;) { // for문 무한반복
			System.out.print("숫자를 맞춰보세요(1 ~ 10) : ");
			int input = scan.nextInt();
			if (input == num) {
				System.out.println("정답입니다");
				break;
			} else if (input > num) {
				System.out.println(input + "보다 더 작은 숫자입니다");
			}else {
				System.out.println(input + "보다 더 큰 숫자입니다");
			}
		}

	}

}
