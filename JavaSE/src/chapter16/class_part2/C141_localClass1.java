package chapter16.class_part2;

public class C141_localClass1 {

	public static void main(String[] args) {
		// 메서드 내에서 클래스 선언 / 메서드 내부에서만 유효
		class Human5 {	// 지역 내부 클래스
			int age;
			String name;
			
			Human5(int age, String name) {
				this.age = age;
				this.name = name;
			}
			
			void intro() {
				System.out.println("안녕, " + age + "살 " + name + "이라고 해");
			}
		}
		
		Human5 kim = new Human5(29, "김상형");
		kim.intro();

	}
	
	static void otherMethod() {
//		Human5 kim = new Human5(30, "홍길동");
	}

}
