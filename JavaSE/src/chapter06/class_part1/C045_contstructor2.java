package chapter06.class_part1;

public class C045_contstructor2 {

	public static void main(String[] args) {
		Time t = new Time();
		t.whatTime();
		
		System.out.println("========================");
		
		Time t2 = new Time(true, 12, 34);
		t2.whatTime();
		
		System.out.println("========================");
		
		Time now = new Time(false, 19, 39, 26);
		now.whatTime();
		
		System.out.println("========================");
		
		Time today = new Time(18, 30);
		today.whatTime();
		
		
		
		
		

	}

}
