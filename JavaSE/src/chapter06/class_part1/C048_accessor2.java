package chapter06.class_part1;

class Time2	{
	private boolean am;
	private int hour;
	private int minute;
	private int second;
	
	// 생성자
	Time2(int hour, int minute, int second) {
		// 메서드를 사용해서 값을 초기화
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
//	public Time2(boolean am, int hour, int minute, int second) {
//		super();
//		this.am = am;
//		this.hour = hour;
//		this.minute = minute;
//		this.second = second;
//	}

	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		if (hour >= 0 && hour <= 23) {
			this.am = hour < 12;
			this.hour = hour % 12;
			if (this.hour == 0 ) {
				this.hour = 12;
			}
		}
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		if (minute >= 0 && minute <= 59) {
			this.minute = minute;
		}
	}
	
	public int getSeond() {
		return second;
	}
	
	public void setSecond(int second) {
		if (second >= 0 && second <= 59) {
			this.second = second;
		}
	}
	
	public void whatTime2() {
		System.out.print(am ? "오전 " : "오후 ");
		System.out.println(hour + "시 " + minute + "분 " + second + "초" );
	}
}

public class C048_accessor2 {

	public static void main(String[] args) {
		Time2 now  = new Time2(12, 34, 56);
//		now.hour = 13; // hour라는 변수는 private이기 때문에 직접적인 참조가 불가능함
		// 직접적인 참조가 불가능 하다
		// -> 참조 = 인스턴스의 위치에 대한 정보를 가리키는 것
		// -> 직접적으로 hour에 대한 정보를 가져올 수 없다
//		System.out.println(now.minute); // err
		// 그렇기 때문에 수정도, 출력도 에러가 난다
		
		now.whatTime2();
		
		// 시간과 분 모두 조건식에서 처리가 되지 않는 값이기 때문에 값이 할당이 되지 않음
		// -> 조건문에서 거부
		now.setHour(34);
		now.setMinute(-25);
		now.whatTime2();

		// 가능
		now.setHour(10);
		now.setMinute(45);
		now.whatTime2();
		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		System.out.println(now.getSeond());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
