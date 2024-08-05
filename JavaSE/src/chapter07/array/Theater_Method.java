package chapter07.array;

import java.util.Scanner;

public class Theater_Method {
	
	//멤버 변수
	private int[][] seats = new int[7][7];
	private final Scanner scan = new Scanner(System.in);
	
	// 콘솔 색
	public static final String RESET = "\u001B[0m";
	public static final String Font_RED = "\u001B[31m";

	
	//멤버 메서드
	// 1. printMenu() : 극장 좌석의 예약 현황을 보여준다.
	public void printMenu() {
		System.out.println(Font_RED + "◆ 극장 좌석 예약 프로그램◆ " + RESET);
		System.out.println("메뉴의 번호를 선택해주세요");
		System.out.println("==================");
		System.out.println("1. 좌석 확인");
		System.out.println("2. 좌석 예약");
		System.out.println("0. 종    료");
		System.out.println("==================");
		System.out.print("> 번호를 선택하세요 : ");
//		String menu = """
//				메뉴의 번호를 선택해주세요
//				====================
//				1. 좌석 확인
//				2. 좌석 예약
//				0. 종    료
//				====================
//				번호를 선택하세요 : 
//				""";
//		System.out.print(menu);
	}
	
	// 2. inputCnt() : 예약할 좌석의 개수를 입력받아 반환한다.
	public int inputCnt() {
		
		int result = 0;
		System.out.print("몇개의 좌석을 예약하시겠습니까? : ");
		result = scan.nextInt();
		reservationSeats(result);
		return result;
	}
	
	// 3. seatInfo() : 2차원배열을 이용하여 극장 좌석의 예약현황을 보여준다.
	//	 (예약 X : 1, 예약 O : 0)
	public void seatInfo() {
		System.out.println("※좌석 예약 정보");
		System.out.println("------------------");
		System.out.print("   ");
		for (int i = 0; i < seats.length; i++) {
			System.out.print((i+1) + " ");
		}
		System.out.println("\n------------------");
		for (int i = 0; i < seats.length; i++) {
			System.out.print((i+1) + "| ");
			for (int j = 0; j < seats[i].length; j++) {
				System.out.print(seats[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
	// 4. reservationSeats(int cnt) : 예약할 좌석의 개수를 매개변수(parameter)로 받고
//	  	  그 횟수만큼 행과 열의 값을 입력받는다.
//	  	  a. 예약이 되어 있지 않을 경우(해당 행과 열의 값이 0일때), 
//	 	     해당 행과 열의 값을 1로 변경하고, "예약되었습니다."라는 문구를 출력한다.
//	  	  b. 예약이 되어 있는 경우(해당 행과 열의 값이 0일때),
//	  	     "x행x열은 예약된 좌석입니다."라는 문구를 출력하고, 다시 행과 열을 입력 받는다.
	public void reservationSeats(int cnt) {
		while (cnt != 0) {
			System.out.print("예약할 좌석의 행 : ");
			int num1 = scan.nextInt() -1;
			System.out.print("예약할 좌석의 열 : ");
			int num2 = scan.nextInt() -1;
			
			if (seats[num1][num2] == 1) {
				System.out.println((num1 + 1) + "행 " + (num2 + 1) + "열은 예약된 좌석입니다.");
			} else if (seats[num1][num2] == 0) {
				seats[num1][num2] = 1;
				System.out.println("예약되었습니다");
				cnt--;
			}
			
		}
		System.out.println();
	}

	public void printText(int num) {
		switch (num) {
		case 1: 
			System.out.println("프로그램을 종료합니다");
			break;
		case 2: 
			System.out.println("잘못 입력하셨습니다");
			break;
		}
	}
}

