package chapter03.condition;

public class C019_If2 {

	public static void main(String[] args) {
		// if block
		int age = 15;
		
		if (age >= 19) {
			System.out.println("성인입니다");
			System.out.println("술집 입장 가능");
		}
		
		System.out.println("================================");
		// 범위 블록을 사용하지 않을 경우 한 행만 조건문으로 인정
		if (age >= 19)
			System.out.println("성인입니다 2222");
		System.out.println("술집 입장 가능 2222");
		
		
		
		
		
		
		
	}

}
