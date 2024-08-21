package chapter16.class_part2;

class OutClass2 {
	private int num = 10;
	private static int sNum = 20;
	
	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println("InStaticClass inNum = " + inNum + "(내부클래스의 인스턴스 변수)");
			System.out.println("InStaticClass sinNum = " + sInNum + "(내부클래스의 정적 변수)");
//			System.out.println("OutClass2 num = " + num + "(외부클래스의 인스턴스 변수)");
			System.out.println("OutClass2 num = " + sNum + "(외부클래스의 정적 변수)");
		}
		
		static void sTest() {
			System.out.println("InStaticClass sinNum = " + sInNum + "(내부클래스의 정적 변수)");
			System.out.println("OutClass2 num = " + sNum + "(외부클래스의 정적 변수)");
		}
	}
}


public class C138_static_innerClass {

	public static void main(String[] args) {
		// 외부 클래스내에 내부 클래스가 포함되어있는 구조인데 static까지 있기 때문에
		// 외부 클래스의 인스턴스 생성시 내부도 자동적으로 만들어지지만
		// 내부 클래스의 인스턴스를 만든다고 해서 외부 클래스의 인스턴스도 자동적으로 만들어지지는 않는다
		OutClass2.InStaticClass sInClass = new OutClass2.InStaticClass();
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		
		System.out.println("정적 내부 클래스 정적 메서드 호출");
		OutClass2.InStaticClass.sTest();

	}

}
