package chapter08.inheritance;

public class C069_overriding1 {

	public static void main(String[] args) {
		// 메서드 오버라이딩 조건
		// 1. 상속관게에서 성립
		// 2. 부모의 메서드의 구조와 동일
		//	  - 메서드명, 파라미터 타입, 개수, 리턴타입
		
		class A {
			int num = 10;
			public void methodA() {
				System.out.println("A : " + num);
			}
		}
		
		class B extends A {
			int num = 100;
			@Override
			public void methodA() {
				System.out.println("B : " + num);
			}
		}
		
		// 만드는 것은 인스턴스로 만들지만 표현은 데이터타입으로 표현한다
		// 가지고는 있더라도 표현을 할 수 있을지는 별개
		
		A a = new A();
		A b = new B();
		B c = new B();
		// 멤버변수는 참조타입에 결정
		System.out.println(a.num);
		System.out.println(b.num);
		System.out.println(b.num);
		System.out.println(c.num);
		// 멤버메서드는 생성타입에 결정
		a.methodA();
		b.methodA();
		c.methodA();
		
	}

}
