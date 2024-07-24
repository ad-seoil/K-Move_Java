package chapter04.loop;

public class Loop_Example09 {

	public static void main(String[] args) {
		// 1번			2번
		// A			A
		// AB			BA
		// ABC			CBA
		// ABCD			DCBA
		// ABCDE		EDCBA

		
		// 1번
		int asciA = 65;
//		char a2 = (char)65;
//		System.out.print(a);
		
		for (int i = 0; i < 5; i++) {
//			System.out.print(i);
			for (int j = 0; j <= i; j++) {
				System.out.print((char)(asciA+j));
			}
			System.out.println();
		}
		
//		for (int i = 'A'; i <= 'E'; i++) {
//			for (char j = 'A'; j <= i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		System.out.println();
		
		// 2번
		for (int i = 0; i < 5; i++) {
//			System.out.print(i);
			for (int j = i; j >= 0; j--) {
				System.out.print((char)(asciA+j));
			}
			System.out.println();
		}
		
//		for (int i = 'A'; i <= 'E'; i++) {
//			for (int j = i; j >= 'A'; j--) {
//				System.out.print((char)j);
//			}
//			System.out.println();
//		}
		
		
	}

}
