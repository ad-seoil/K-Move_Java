package chapter14.exception;

import java.util.Scanner;

// DashException	생성
class DashException extends Exception {

	public DashException(String message) {
		super(message);
	}

}

// LengthException	생성
class LengthException extends Exception {

	public LengthException(String message) {
		super(message);
	}

}

public class Exception_Example {
	
	// 예외처리를 미룸
	public static void main(String[] args) throws Exception {
		// 주민등록번호를 입력받고 입력받은 주민등록번호에
		// 7번째에 - 이 없으면 DashException 예외 발생후 문구 출력
		// 주민등록번호가 14자리가 아닐 경우 LengthException
		// 예외 발생후 문구 출력
		
		
		// 입력받고 저장
		Scanner scan = new Scanner(System.in);
		System.out.println("주민등록 번호를 입력해주세요");
		String num = scan.next();
		num = "123456-1234567";

		// 조건 및 예외발생
		if (num.length() != 14) {
			throw new LengthException("주민등록번호는 14자리입니다");
		} else if(num.charAt(6) != '-') {
			throw new DashException("7번째에는 - 이 들어가야 합니다");
		}
		System.out.println("입력받은 주민등록번호 : " + num);
		
		
		try (Scanner sc = new Scanner(System.in)){
			// 주민등록번호 입력받기
			System.out.print("주민등록번호를 입력하세요 ( 예:981010-1234567) : ");
			String ssn = sc.nextLine();
			
			if (ssn.length() != 14) {
				throw new LengthException("주민등록번호는 14자리입니다");
			} else if(ssn.charAt(6) != '-') {
				throw new DashException("7번째에는 - 이 들어가야 합니다");
			}
			
		} catch (LengthException e) {
			System.out.println(e.getMessage());
		} catch (DashException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
