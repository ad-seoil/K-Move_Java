package chapter08.inheritance;

class Human {
	int age;
	String name;
	
	Human(int age, String name) {
		System.out.println("==== Human 생성자 ====");
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.println("안녕," + age + "살 " + name + "이라고 해");
	}
	
}

class Student extends Human{
	int stNum;
	String major;
	
	Student(int age, String name, int stNum, String major){
		super(age, name);	// 부모클래스 생성자 호출
		// super로 부모 클래스의 변수를 가져와야 하는 이유는
		// 상속을 받았기 때문에 쓸수는 있으나
		// 값을 초기화거나 할당을 해서 쓰기 위해서는 다시 불러올 필요가 있기 때문에
		System.out.println("==== Student 생성자 ====");
		this.stNum = stNum;
		this.major = major;
	}
	
	void study() {
		System.out.println("이름 : " + super.name + ", 학번 : " + stNum + ", 전공 : " + this.major);
	}
	
	
}

class Graduate extends Student {
	String thesis;
	
	Graduate(int age, String name, int stNum, String major, String thesis) {
//		System.out.println("==== Graduate 생성자 ====");
		// 부모 클래스의 인스턴트 생성부터 시작해야함
		super(age, name, stNum, major);
		System.out.println("==== Graduate 생성자 ====");
		this.thesis = thesis;
	}
	
	void research() {
		System.out.println("논문 : " + thesis + ", 저자 : " + super.name);
	}
	
}

public class C068_super {

	public static void main(String[] args) {
		Human kim = new Human(29, "김상형");
		kim.intro();
		
		Student lee = new Student(42, "이승우", 20241001, "경영");
		lee.intro();
		lee.study();
		
		Graduate park = new Graduate(35, "박대희", 20241002, "전산", "웹 보안에 대한 연구");
		park.intro();
		park.study();
		park.research();
		
		Human test = new Student(42, "이승우", 20241002, "경영");
		System.out.println(test.name);
		// human 타입으로 표현할 수 있는 name만 표현가능함
//		System.out.println(test.major);
//		System.out.println(test.stNum);
		
	}

}
