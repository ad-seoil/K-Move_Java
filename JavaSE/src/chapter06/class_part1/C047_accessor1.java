package chapter06.class_part1;

/*
 	접근 지정자(= 접근 제어자)
 	클래스, 메서드, 변수 등에 대한 접근 범위를 지정하여 외부로부터 접근을 제어 
 	public, protected, default, private
 */

class A {
	
	private int value2 = 1000;

	// value2는 접근제어자가 private으로 다른 클래스에서 직접적으로 가져올 수가 없기 때문에
	// 같은 클래스 내에서 public 접근제어자인 method()를 사용해 우회하여 value2를 가져올 수 있게 함
	public int method() {
		return value2;
	}
}

public class C047_accessor1 {

	int value;	// 멤버변수
	
	public static void main(String[] args) {
		C047_accessor1 instance = new C047_accessor1();
		instance.value = 100;
		System.out.println(instance.value);
		
		A a = new A();
//		a.value2;	// private라는 접근제어자때문에 다른 클래스에서 가져올 수 없음
		System.out.println(a.method());
		
		

	}

}
