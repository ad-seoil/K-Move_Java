package chapter14.exception;

public class C117_throw1 {

	public static void main(String[] args) {
//		String name = "빌게이츠";
		
		String name = null;
//		name.length();
		printScore(name);
		System.out.println("프로그램 종료");

	}
	
	static void printScore(String name) {
//		System.out.println(name.length());
		
		try {
			System.out.println(name.length());
		} catch (NullPointerException e) {
			System.out.println("이름이 무효합니다");
		}
		System.out.println("메서드 종료");
		
	}

}
