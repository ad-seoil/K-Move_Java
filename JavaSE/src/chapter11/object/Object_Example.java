package chapter11.object;

import java.util.Scanner;

public class Object_Example {

	public static void main(String[] args) {
		// 주민등록번호 입력받기
		// 1. - 을 포함한 14자리를 문자열로 입력받는다
		// 2. 14자리거나 아니거나 - 이 없다면 실행 종료
		// 3. 입력받은 주민등록 번호의 부분을 추출하여 출생연도, 출생 월, 출생 일, 성별을 출력한다
		// 4. 주민등록번호의 뒷자리의 숫자가 1, 2일 경우 1900년대 생이고 3, 4 일 경우 2000년대 생
		//	  주민등록번호의 뒷자리의 숫자가 1, 3일 경우 남자이고 2, 4 일 경우 여자
		
		
		// 문자열 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("주민등록번호를 입력하세요 (예 : 900101-1234567) : ");
		String id = scan.next();
//		String id = "041213-4551234";
		
		// 14자리 및 - 포함 상태 확인
		// 14자리인지
		// - 이 포함되어 있는지
//		System.out.println(id.indexOf("-"));
		if (id.indexOf("-") == -1 || id.length() != 14) {
			System.out.println("시스템을 종료합니다");
			return;
//			System.exit(0);
		}
		
		
		// 주민등록 번호에 따라 정보 출력
		// 출생연도, 출생 월, 출생 일, 성별 출력
		String sexuality = "";
//		System.out.println(id.charAt(7));
		if (id.charAt(7) == '1' || id.charAt(7) == '2' ) {
			System.out.println("출생 연도 : 19" + id.substring(0, 2));
			if (id.charAt(7) == '1' || id.charAt(7) == '3' ) {
				sexuality = ("남성");
			}
		} else if (id.charAt(7) == '3' || id.charAt(7) == '4') {
			System.out.println("출생 연도 : 20" + id.substring(0, 2));
			if (id.charAt(7) == '2' || id.charAt(7) == '4') {
				sexuality = ("여성");
			}
		}
		
		System.out.println("출생 월 : " + id.substring(2, 4));
		System.out.println("출생 일: " + id.substring(4, 6));
		System.out.println("성별 : " + sexuality);
		
		
//		String birthYear = id.substring(0,2);
//		String birthMonth = id.substring(2,4);
//		String birthDay = id.substring(4,6);
//		char genderCode = id.charAt(7);
//		String gender = "";
		
//		switch (genderCode) {
//			case '1': case '2' :
//				birthYear = "19" + birthYear;
//				gender = (genderCoder == '1') ? "남성" : "여성";
//				break;
//			case '3' : case '4' :
//				birthYear = "20" + birthYear;
//				gender =(genderCode== '3')? "남성" : "여성";
//				break;
//		}
//		System.out.println("출생 연도	: " + birthYear);
//		System.out.println("출생 월 	: " + birthMonth);
//		System.out.println("출생 일	: " + birthDay);
//		System.out.println("성별 		: " + gender);
		
	}
}
