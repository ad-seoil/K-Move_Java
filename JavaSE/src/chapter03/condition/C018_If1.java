package chapter03.condition;

public class C018_If1 {

	public static void main(String[] args) {
		// if
		int age = 15;
		
		if (age >= 19) {
			System.out.println("성인입니다");
		}
		
		// if - else
		if (age >= 19) {
			System.out.println("성인입니다 2트");
		} else {	// age < 19
			System.out.println("어린이입니다");
			System.out.println("금쪽이입니다");
		}
		
		// if - else if - else
		if (age >= 19) {
			System.out.println("성인입니다 3트");
		} else if (age > 12) {	// age > 12 && age < 19
			System.out.println("청소년입니다");			
		} else {	// age <= 12
			System.out.println("어린이입니다 2트");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
