package chapter07.array;

import java.util.Scanner;

public class Array_Example01 {

	public static void main(String[] args) {
		// Original : 10 20 30 40 50 60 70 80 90 100
		// 변경하고 싶은 위치 1을 입력하세요
		// 1
		// 변경하고 싶은 위치 2를 입력하세요
		// 1
		// new 100 20 30 40 50 60 70 80 90 10
		
		
		// 초기화
		int[] original = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		for (int i = 0; i < original.length; i++) {
			System.out.print(original[i] + " ");
		}
		System.out.println();
		
		// 입력
		Scanner scan = new Scanner(System.in);
		
		int cnt = 0;
		int[] inputNum = {0, 0};
		while (cnt < 2) {
			System.out.print("변경하고 싶은 위치" + (cnt+1) + "을 입력하세요 : ");
			inputNum[cnt] = scan.nextInt();
			cnt++;
		}
		
//		System.out.print("변경하고 싶은 위치1 을 입력하세요 : ");
//		int num1 = scan.nextInt();
//		System.out.print("변경하고 싶은 위치2 을 입력하세요 : ");
//		int num2 = scan.nextInt();
		
		// 위치 교환
//		int temp = original[num1-1];
//		original[num1-1] = original[num2-1];
//		original[num2-1] = temp;
		
		int temp = original[inputNum[0]-1];
		original[inputNum[0]-1] = original[inputNum[1]-1];
		original[inputNum[1]-1] = temp;
		
		// 결과 출력
		System.out.print("New : ");
		for (int i = 0; i < original.length; i++) {
			System.out.print(original[i] + " ");
		}
		
	}

}
