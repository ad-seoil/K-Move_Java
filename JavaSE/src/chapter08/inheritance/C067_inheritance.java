package chapter08.inheritance;

class A {
	String name;
	private int age;
	
	public void method() {
		System.out.println(name + " 메서드 출력");
	}
}


class B extends A {	// A 클래스를 상속받겠다
	String value = "B클래스 변수";
	
	@Override
	// 오버라이딩임을 명시
	public void method() {
		System.out.println(value + " 재정의한 메서드 출력");
//		System.out.println(age);	// private은 상속받을 수 없음
	}
	
	public static void method2() {
		System.out.println("자식꺼 메서드");
	}
}


public class C067_inheritance {

	public static void main(String[] args) {
		A a = new A();
		a.name = "홍길동";
		a.method();
		
		B b = new B();
		b.name = "이순신";
		b.method();
		b.method2();
		
		
		// 상속
		// - 상속은 부모가 자식에게 물려주는 행위
		// - 객체 지향 프로그래밍에서도 부모(상위) 클래스의 멤버를
		//	 자식(하위) 클래스에 물려주어 자식 클래스에서 사용할 수 있다
		// - 공통점을 가지고 있는 객체들끼리 어떤 고나겔르 나타내기 위함
		// - IS-A 관계 (is a relationship)
		
		//

	}

}
