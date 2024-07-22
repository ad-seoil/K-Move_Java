package chapter04.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Loop_Example01 {

	public static void main(String[] args) {
		// 정수 5개를 입력받아 그 합을 출력하세요
		// 출력 결과 :
		// 정수 입력 : 1
		// 정수 입력 : 2
		// 정수 입력 : 3
		// 정수 입력 : 4
		// 정수 입력 : 5
		// 15

		
		// 입력받기 위한 스캔
		Scanner scan = new Scanner(System.in);
		
		// 총 합을 담을 변수
		int sum = 0;
		
		// 숫자 입력 및 합 5번 반복
		for (int i = 0; i < 5; i++) {
			System.out.print("정수 입력 : ");
			int num = scan.nextInt();
			sum += num;
		}
		System.out.println("총 합 : " + sum);
		
		System.out.println("==============================");
		
		int cnt = 0;
		int sum2 =0;
		while(cnt < 5) {
			System.out.print("정수입력: ");
			int num2 = scan.nextInt();
			sum2 += num2;
			cnt++;
		}
		System.out.println(sum2);
		
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int sum2 = 0;
//		try {
//			String s = br.readLine();
//			for (int i = 0; i < args.length; i++) {
//				System.out.print("정수 입력 : ");
//				int j = Integer.parseInt(br.readLine());
//				sum2 += j;
//			}
//			
//			System.out.println(sum2);
//		} catch (NumberFormatException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		scan.close();
		
	}

}
