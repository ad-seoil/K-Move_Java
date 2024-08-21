package chapter16.class_part2;

class A {
	void method() {
		System.out.println("A1");
	}
}

interface B {
	void methodB();
}

abstract class C {
	abstract void methodC();
}


public class C143_anonymousClass {

	public static void main(String[] args) {
		A a = new A();
		a.method();
		
		// 익명클래스 생성
		// new 조상클래스 이름 {}
		new Object() {
			void method() {
				System.out.println("A2");
			}
		}	// 이름 없는 인스턴스를 만든 것
		.method();
		
		// new 구현할 인터페이스의 이름 {}
		new B() {
			@Override
			public void methodB() {
				System.out.println("B");
			}
		}.methodB();
		
		
		new C() {
			@Override
			void methodC() {
				System.out.println("C");
			}
		}.methodC();
		
	}

}
