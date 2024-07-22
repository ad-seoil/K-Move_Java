package chapter04.loop;

public class C029_nestLoop {

	public static void main(String[] args) {
		// 2중 반복문
		
		// ex. 구구단
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}
		
		
		// 가로 ver.
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(j + " * " + i + " = " + i*j + "\t");
			}
			System.out.println();
		}
		
		
		
		
		

	}

}
