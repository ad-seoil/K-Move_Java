package chapter14.exception;

public class C119_thorw3 {

	public static void main(String[] args) {
		// CheckedException : 컴파일러가 예외처리를 강제하는 예외
		// 예외가 발생할 수 있는 메서드를 호출할 때, 해당 예외를 try-catch 블록으로
		// 처리하거나, 메서드에 throws 키워드를 사용해 명시적으로 예외를 던져야함
		// ex) IOException, SQLException ...
		
		
// 예외처리를 그 어디에도 하지않으면 프로그램이 중단됨
//	public static void main(String[] args) throws Exception{
		
		String name = null;
		try {
			printScore(name);
		} catch (Exception e) {
			
		}
		
	}

	static void printScore(String name) throws Exception {
		// throw : 예외객체를 발생시키는 키워드
		// throws : 예외처리를 미루는 키워드
		
//		try {
//			if (name == null) {
//				// 컴파일 시점의 예외이기 때문에 예외처리를 강제한다
//				throw new Exception("이름이 무효합니다");
//			}
//			System.out.println(name.length());
//		} catch (Exception e) {
//			
//		}
		
		if (name == null) {
			// 아니면 throws Exception을 통해 넘겨버려야함
			throw new Exception("이름이 무효합니다");
		}
		System.out.println(name.length());
	}
	
	
}
