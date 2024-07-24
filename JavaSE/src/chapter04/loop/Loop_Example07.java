package chapter04.loop;

public class Loop_Example07 {

	public static void main(String[] args) {
		// 3번		4번
		//     *	*****
		//    **	 ****
		//   ***	  ***
		//  ****	   **
		// *****		*
		
		
		// 1번
		for (int i = 1; i <= 5; i++) {
//			System.out.print(i);
			for (int j = 5; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
//				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 2번
		for (int i = 5; i > 0; i--) {
//			System.out.print(i);
			for (int j = 5; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
//				System.out.print(j);
			}
			System.out.println();
		}
		
		
//		for (int i = 5; i >= 1; i--) {
//			for (int j = 1; j <= 5 - i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		

	}

}
