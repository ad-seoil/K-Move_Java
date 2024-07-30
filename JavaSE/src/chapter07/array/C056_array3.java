package chapter07.array;

public class C056_array3 {

	public static void main(String[] args) {
		int[] score = {88, 99, 70, 55, 100};
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println();
		
		
		// 재초기화 
		score = new int[] {1, 2, 3, 4, 5};
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		
	}

}
