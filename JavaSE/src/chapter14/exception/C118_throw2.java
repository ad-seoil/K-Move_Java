package chapter14.exception;

public class C118_throw2 {

	public static void main(String[] args) {
		// Unchecked Exception : 컴파일러가 예외처리를 강제하지 않는 예외
		// 이 예외는 RumtimeException을 상속하는 예외로, 
		// NullPointerException. ArratIndexOutOfBoundsException등이 있다
		// 위 예외들은 컴파일시점이 아닌 프로그램 실행중에 발생할 수 있으며,
		// throws 키워드를 사용하지 않아도 컴파일 에러가 발생하지 않는다
		
		
		String name = null;
//		printScore(name);
		try {
			printScore(name);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	static void printScore(String name) {
		if (name == null) {
			throw new NullPointerException("이름이 무효합니다");
		}
		System.out.println(name.length());
		
	}
	
}
