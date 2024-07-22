package chapter04.loop;

public class C034_break {

	public static void main(String[] args) {
		// break = 반복문을 중단
		for (int i = 1; i < 10; i++) {
			if (i == 7) {
				break;				
			}
			System.out.println("반복회차 : " + i);
		}

	}

}
