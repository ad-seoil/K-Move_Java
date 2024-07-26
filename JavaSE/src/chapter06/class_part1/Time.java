package chapter06.class_part1;

import java.time.LocalTime;

public class Time {
	boolean am;
	int hour;
	int minute;
	int second;
	
	// 초기화 블록
	// 생성자보다 더 먼저 실행되는 블록
	{
		LocalTime now = LocalTime.now();
		hour = now.getHour();
		if (hour >= 12) {
			hour -= 12;
			am = false;
		} else {
			am = true;
		}
		minute = now.getMinute();
		second = now.getSecond();
		System.out.println("초기화 블록 실행");
	}
	
	Time(){
		System.out.println("기본생성자 실행");
	}

	// this
	// - 클래스 내부에서는 해당 인스턴스를 부를 이름이 없다
	// - 인스턴스 이름이 각각 달라지기 때문에 this 예약어를 사용하므로써 지금 다루는 데이터가 그 지신을 가르키도록 한다
	
	Time(boolean am, int hour, int minute, int second) {
//		this.am = am; 
//		this.hour = hour;
//		this.minute = minute;
//		System.out.println(1);
		this (am, hour, minute); 
		// this와 달리 this()는 같은 클래스에서 생성자가 다른 생성자를 호출할 때 사용됨
		// this()는 생성자 코드에서만 사용할 수 있음
		// this()는 첫번째 문장으로 다른 코드보다 가장 윗줄에 위치해야 함
//		System.out.println(2);
		this.second = second;
		System.out.println("파라미터 4개인 명시적 생성자 실행");
	}
	
	Time(boolean am, int hour, int minute) {
		this.am = am;
		this.hour = hour;
		this.minute = minute;
		this.second = 0;
		System.out.println("파라미터 3개인 명시적 생성자 실행");
	}
	
	Time(int hour24, int minute){
		this.am = hour24 < 12;
		this.hour = hour24 % 12;
		this.minute = minute;
		this.second = 0;
		System.out.println("파라미터 2개인 명시적 생성자 실행");
	}
	
	void whatTime() {
		System.out.println(am ? "오전 " : "오후 ");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}
	

}
