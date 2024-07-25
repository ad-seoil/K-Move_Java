package chapter06.class_part1;

class Car {
	
	// 멤버 변수
	String name;
	boolean gasoline;
	
	// 멤버 메서드
	void run() {
		if (gasoline) {
			System.out.println("부릉 부릉");
		} else {
			System.out.println("덜컹 덜컹");
		}
	}
	
	void stop() {
		System.out.println("정지");
	}
	
	// 기본 생성자
	public Car() {
		name = "똥차";
	}

}

public class C042_class_basic1 {

	public static void main(String[] args) {
		Car korando = new Car(); 
		// 기본 생성자에서 아무것도 정의하지 않으면 문자열은 null, 참 거짓은 false, 숫자는 0이다
		System.out.println(korando.name);
		korando.run();
		
		korando.name = "코란도C";		// . = 속성생성자
		korando.gasoline = false;
		System.out.println(korando.name);
		korando.run();
		

	}

}
