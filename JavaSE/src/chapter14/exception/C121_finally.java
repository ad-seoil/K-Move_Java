package chapter14.exception;

public class C121_finally {

	public static void main(String[] args) {
		System.out.println("접속");

		try {
			System.out.println("전송");
			throw new Exception();
//			System.out.println("처리문");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("예외 처리");
		} finally {	
			// try든 catch든 예외가 발생하든 아니든
			// 무조건 마지막에 실행되는 문장
			System.out.println("해제");
		}
		
	}

}
