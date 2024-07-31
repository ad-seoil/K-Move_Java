package chapter07.array;

import java.util.Random;

public class Array_Example_Random {

	public static void main(String[] args) {
		// 난수를 발생시키는 방법
		
		// Math 클래스의 random 메서드를 사용 1 ~ 10
		double num = Math.random();
		int num2 = (int) (Math.random() * 10 + 1 );
		System.out.println(num);
		System.out.println(num2);
		
		// Random 클래스의 객체를 통해 난수 발생 0 ~ 9
		Random r = new Random();
		int j = r.nextInt(10);
		int k = r.nextInt();
		System.out.println(j);
		System.out.println(k);
		

	}

}
