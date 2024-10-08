package chapter16.class_part2;

class OutClass {
	private int num = 100;
	private static int sNum = 20;
	
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass {
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부클래스의 정적 변수)");
			System.out.println("InClass inNum = " + inNum + "(내부클래스의 인스턴스 변수)");
			System.out.println("InClass sInNum = " + sInNum + "(내부클래스의 정적 변수)");
		}
 	}
	
	public void usingClass() {
		inClass.inTest();
	}
}

public class C135_innerClass2 {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스를 이용하여 내부 클래스 메서드 호출");
		outClass.usingClass();
		
		System.out.println("\n다른 클래스에서 인스턴스 내부 클래스 생성");
		OutClass outClass2 = new OutClass();
		OutClass.InClass inClass = outClass2.new InClass();
		// -> 외부 인스턴스 하나, 내부 인스턴스 2개인 구조가 됨
		inClass.inTest();
		
		

	}

}
