package chapter07.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array_Example03 {

	public static void main(String[] args) {
		// 서로 다른 무작위 숫자(0~9) 10개가 들어있는 int형 배열을 만든 뒤,
		// 사용자에게 10이하의 자연수 2개를 입력받고,
		// 해당하는 인덱스에 있는 배열의 교환하고 출력하시오
		
		// 변경 전 : 2 5 5 1 3 4 3 6 2 2 
		// 변경하고 싶은 위치 : ;
		// 변경할 위치 : 2
		// 변경 후 : 5 2 5 1 3 4 3 6 2 2 
		
		
		// 난수설정을 위한 math의 random
		Random r = new Random();
		
		// 10개가 들어있는 int형 배열
		int[] arr = new int[10];
		
		// 변경 전 난수 설정
		System.out.print("변경 전 : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(11); // 파라미터의 값 전까지의 정수를 발생
			System.out.print(arr[i] + " ");
		}
		
		// 변경할 위치 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("\n변경하고 싶은 위치 : "); // \n = 개행을 하고 출력
		int before = scan.nextInt() - 1;
		System.out.print("변경할 위치 : ");
		int after = scan.nextInt() - 1;
		
		// 변경
		int temp = arr[before];
		arr[before] = arr[after];
		arr[after] = temp;
		
		// 변경 후 출력
		System.out.print("변경 후 : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
//		System.out.println(Arrays.toString(arr));
		
	}

}
