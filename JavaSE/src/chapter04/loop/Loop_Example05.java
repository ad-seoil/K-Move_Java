package chapter04.loop;

public class Loop_Example05 {

	public static void main(String[] args) {
		// 1번		2번
		// 1000		12345
		// 0200		23456
		// 0030		34567
		// 0004		45678

		
		// 1번
		// i의 값만큼 i번째에 i의 숫자가 들어가도록
		// 그저 반복문 + 제어문으로만
		
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i-1; j++) {
				System.out.print(0 + " ");
			}
			System.out.print(i + " ");
			for (int j = 5; j-i > 0; j--) {
				System.out.print(0 + " ");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5; j++) {
//				if (i == j) {
//					System.out.print(i + " ");
//				} else {
//					System.out.print(0 + " ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
		// 2번
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i+j +" ");
			}
			System.out.println();
		}
		
		
//		for (int i = 1; i <= 5; i++) {
//			for (int j = i; j < i + 5; j++) {
//				System.out.print(j +" ");
//			}
//			System.out.println();
//		}
		
		
		
		
		
	}

}
