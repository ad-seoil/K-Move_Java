package chapter05.method;

import java.time.LocalDate;

public class C039_method4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("오늘은 " + getData()+ "일");
	}

	
	private static int getData() {
		LocalDate today = LocalDate.now();
		int day = today.getDayOfMonth();
		return day;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
