package chapter14.exception;

// 사용자 정의 예외 클래스
public class IDFormatException extends Exception{

	public IDFormatException(String message) {
		super(message);
	}

}
