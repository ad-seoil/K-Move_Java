package chapter08.inheritance;

class AA {
	final static double PI = 3.14;
	
	void method() {
		System.out.println("final double");
	}

	public void finalMethod() {
		System.out.println("final method");
		
	}
	
}

final class BB extends AA {
	// overrind 단축키  alt' + shift + s / v'
	@Override
	void method(){
		super.method();
		System.out.println("method BB");
	}
	@Override
	public void finalMethod() {
		// TODO Auto-generated method stub
		
	}
}
	
// final 메서드는 재정의 불가
//	@Override
//	void method(){
//		super.method();
//		System.out.println("final method BB");

// final class는 상속불가
//class CC extends BB() {
//
//}


public class C071_final {

	public static void main(String[] args) {
		// final 
		// - final 변수 : 상수, 값 변경 불가
		// - final 클래스 : 상속불가
		// - final 메서드 : overriding 불가
		
		AA aa = new AA();
		AA ab = new BB();
		BB bb = new BB();
		
		System.out.println(aa.PI);
		System.out.println(ab.PI);
		System.out.println(bb.PI);
		// aa.PI = 3.145353452;
		
		aa.method();
		aa.finalMethod();
		ab.method();
		ab.finalMethod();
		bb.method();
		bb.finalMethod();
		
		
		
		
		
	}

}
