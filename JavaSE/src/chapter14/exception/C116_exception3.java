package chapter14.exception;

public class C116_exception3 {

	public static void main(String[] args) {
		int a, b, c;
		a = 5;
		b = 2;
		int[] arr = { 1, 2, 3, 4, 5};
		
		try {
			c = a / b;
			System.out.println("c = " + c);
			arr[5] = 100;
			
		//				or 연산자 하나만 적어서 or연산자처럼 사용가능
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("0으로 나누기 또는 배열 범위 " + "초과 예외 발생");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("프로그램 실행 완료");
		
	}

}
