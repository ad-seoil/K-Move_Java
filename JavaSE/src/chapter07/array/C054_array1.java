package chapter07.array;

import java.lang.reflect.Array;
import java.util.Iterator;

public class C054_array1 {

	public static void main(String[] args) {
		// 배열 선언, 초기화
		int[] arr1 = new int[5];
		int arr2[] = new int[5];

		int[] arr3 = new int[] { 0, 1, 2, 3, 4};
		int arr4[] = {0,1,2,3,4};
		
		int[] arr5;
		arr5 = new int[] {6,7,8};
		
		int arr6[];
//		arr6 = {9, 10, 11}; // 참조변수에 바로 요소 집어넣는건 불가능

		// 배열은 index가 존재하기에 반복문과 같이 사용함
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		System.out.println(arr3.length);
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3[3]);
		System.out.println(arr3[4]);
//		System.out.println(arr3[8]);	//err
		
		
	}

}
