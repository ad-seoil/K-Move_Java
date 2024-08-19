package chapter14.exception;

public class C115_exception2 {

	public static void main(String[] args) {
		// 다중 예외 처리
		int a, b, c;
		a = 5;
		b = 2;
		int[] arr = {1, 2, 3, 4, 5};
		
		// 예외가 발생할 시점에서 catch문으로 넘어가기 때문에 다음 try줄은 실행이 안됨
		try {
			c = a / b;
			System.out.println("c = " + c);
			arr[5] = 100;
			
		// 이렇게는 불가능함 Exception은 최상위 클래스로서 밑에 설정한 에러들로 도달할 수 없기 때문에
//		} catch (Exception e) {
//			e.printStackTrace();
		
		} catch (ArithmeticException arithErr) {
			System.out.println("0으로 나누기 예외 발생");
		} catch (ArrayIndexOutOfBoundsException arrIndexErr) {
			System.out.println("첨자가 배열 범위를 넘어섰습니다");
		} catch (Exception e) {
			e.printStackTrace();
			
			// 다형성에 의해 부모타입으로도 인스턴스 표현을 할 수 있음
//			Exception e1 = new ArithmeticException();
//			ArithmeticException e2 = new ArithmeticException();
		}

		System.out.println("프로그램 실행 완료");
		
	}

}
