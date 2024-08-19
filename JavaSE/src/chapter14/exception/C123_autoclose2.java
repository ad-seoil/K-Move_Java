package chapter14.exception;

import java.util.Scanner;

class NetAccess implements AutoCloseable {
	public void open() {
		System.out.println("접속");
	}
	public void send() {
		System.out.println("전송");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("해제");
	}
	
}


public class C123_autoclose2 {

	public static void main(String[] args) {
		// try-with-resource
		// try문에 소괄호를 사용하면 자원을 사용하는 인스턴스를 생성하는 구문을 안에 넣어줌
		// 자동으로 close문을 호출해준다
		try (NetAccess na = new NetAccess()) {
			na.open();
			na.send();
		} catch (Exception e) {
			
		} finally {
			
		}
		
		try (Scanner sc = new Scanner(System.in)) {
			
		} 

	}

}
