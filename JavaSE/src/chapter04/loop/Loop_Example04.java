package chapter04.loop;

public class Loop_Example04 {

	public static void main(String[] args) {
		// 수열 출력
		// 1번		2번		3번
		// 00000	00000	01234
		// 00000	11111	01234
		// 00000	22222	01234
		// 00000	33333	01234
		// 00000	44444	01234
		
		
		// 1번
		for (int i = 0; i < 5 ; i++) {
			int k = 0;
			for (int j = 0; j < 5; j++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 2번
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		// 3번
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
