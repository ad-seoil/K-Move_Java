package chapter07.array;

import java.util.Scanner;

public class Array_Example02 {

	public static void main(String[] args) {
		// 원소 개수를 입력받아 배열을 생성하고 각 원소의 값을 입력받아 저장한 후
		// 전제 원소의 합계를 구하여 출력
		
		// 배열 원소 개수는 2 이상의 정수로 입력받는다
		// 2 미만의 값이 입력되면 오류메시지를 출력하고 다시 입력받는다
		
		// 배열의 크기 :  5					배열의 크기 : 1
		// arr[0] = 1					2 이상의 값을 입력하세요
		// arr[1] = 2					배열의 크기 : ( 입력대기 )
		// arr[2] = 3
		// arr[3] = 4
		// arr[4] = 5
		// 1 + 2 + 3 + 4 + 5 = 15

		
		// 배열의 크기 입력
		Scanner scan = new Scanner(System.in); // 입력을 받기 위한 스캐너
		
		boolean roop = true; // 첫 입력의 반복을 돌리기 위한 변수
		int sum = 0;		 // 총 합을 담을 변수
		int arraySize = 0;   // 입력받은 배열의 크기를 담을 변수
		
		while(roop) {
			System.out.print("배열의 크기 : ");
			arraySize = scan.nextInt();
			
			// 배열의 크기가 2이상이 아닐결국 다시 반복
			if (arraySize >= 2) {
				roop = false;
			} else if (arraySize < 2) {
				System.out.println("2 이상의 값을 입력하세요");
			}
		}
		// 굳이 roop 변수를 선언 안하고 그냥 true로 시작을 해서 조건 충족시 break를 걸거나 조건식으로 반복시키는 방법도 좋을거 같음
		
		
		// 입력받은 수만큼의 크기의 배열 생성
		int[] arr = new int[arraySize];
		
		// 배열의 크기 만큼 수를 입력
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] = ");
			int num = scan.nextInt();
			arr[i] = num;
		}
		
		// 전체 원소의 총 합
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " + ");
			sum += arr[i];
		}
		System.out.println("= " + sum);
		
	}

}
