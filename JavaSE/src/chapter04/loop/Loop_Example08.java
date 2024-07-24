package chapter04.loop;

public class Loop_Example08 {

	public static void main(String[] args) {
		// 1번
		//     *
		//    ***
		//   *****
		//  *******
		// *********
		
		// 2번
		// *********
		//  *******
		//   *****
		//	  ***
		//	   *
		
		
		// 1번
		// 공백까지 대칭으로
		for (int j = 1; j < 10; j+=2) {
			for (int k = 0; k < (9-j)/2; k++) {
				System.out.print(" ");
			}
			for (int h = 0; h < 9 - (9-j); h++) {
				System.out.print("*");
			}
			for (int k = 0; k < (9-j)/2; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}

		// 1 - 2
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 0; j < 5-i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < 2*i-1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		System.out.println();
		
		// 2번
		for (int j = 9; j >= 1; j-=2) {
			for (int k = 0; k < (9-j)/2; k++) {
				System.out.print(" ");
			}
			for (int h = 0; h < 9 - (9-j); h++) {
				System.out.print("*");
			}
			for (int k = 0; k < (9-j)/2; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
//		for (int i = 5; i >= 1; i--) {
//			for (int j = 5-i; j > 0; j--) {
//				System.out.print(" ");
//			}
//			for (int k = 2*i-1; k > 0; k--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		
		
	}

}
