package chapter06.class_part1;

class Test1 {
	// 인스턴스 변수, 멤버 변수
	private String name1 = "홍길동";
	// 정적 멤버 변수
	public static String name2 = "이순신";
	private static final String name3 = "고길동";
	
	public void printName() {
		System.out.println(this.name1);
//		System.out.println(this.name3); // 불러낼수는 있지만 의미가 없음
	}
	
	public static void printName2() {
//		System.out.println(this.name3); 
		// this사용이 불가한데 this가 자기 자신을 가르키는 건 맞지만, 인스턴트를 가르키는 것이기 때문
		System.out.println(name3);
	}
	
	
}

public class C050_static1 {

	public static void main(String[] args) {
//		System.out.println(name1); // 객체가 없어서 err
		Test1 ex = new Test1();
//		System.out.println(ex.name1); // private라 err
		ex.printName();
		
		// 정적 멤버 변수는 인스턴스 생성없이 클래스의 이름으로 호출 가능
		System.out.println(Test1.name2);
//		System.out.println(Test1.name3); // 할당은 되어있지만 private라 err
		Test1.printName2();
		
		
		
	}
	
	
	
}
