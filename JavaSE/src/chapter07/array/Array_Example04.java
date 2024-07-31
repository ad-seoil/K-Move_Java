package chapter07.array;

import java.util.Arrays;

public class Array_Example04 {
	
	public static void main(String[] args) {
		
		// 임의의 배열 array를 역순으로 출력
		// 원래 배열 -> 브레드 월크 초코 소세지 치크
		// 역순 배열 -> 치즈 소세지 초코 월크 브레드
		
	
		// 임의의 String 배열 초기화
		String[] array = {"개방", "소림사", "무당파", "아미파", "화산파", "곤륜파", "종남파", "공동파", "점창파"};
		
		// 원래 배열 출력
		System.out.print("원래 배열 -> ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		// 역순 배열 출력
		System.out.print("\n역순 배열 -> ");
		for (int i = array.length -1; i >= 0 ; i--) {
//			System.out.println(i);
			System.out.print(array[i] + " ");
		}
		
//		System.out.println(Arrays.toString(array));
		
	}
	
}
