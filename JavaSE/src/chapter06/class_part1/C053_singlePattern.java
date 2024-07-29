package chapter06.class_part1;

class Singleton {
	// 유일한 단일 객체를 참조할 정적 참조 변수
	private static Singleton instance;
	
	// new 키워드를 사용할 수 없도록 생성자에 private 지정
	private Singleton() {
		
	}
	
	// 유일한 단일 객체를 반환할 수 있는 정적 메서드
	public static Singleton getInstance() {
		// 인스턴스가 null 이면 생성하고, 아니면 생성되어 있는 instance를 반환
		// -> 단 하나만의 객체를 생성하여 사용
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void printMethod() {
		System.out.println("인스턴스로부터 메서드 호출");
	}
	
}

public class C053_singlePattern {

	public static void main(String[] args) {
//		Singleton err = new Singleton(); // 생성자를 private로 막아서 인스턴스가 안됨
		
		Singleton st = Singleton.getInstance(); // 생성자를 만들 메서드를 호출해서 만듬
		st.printMethod();
		
		
		// 싱글톤 패턴은 왜 쓰는가?
//		- 싱글톤 패턴은 객체 지향 프로그램이에서 특정 클래스가 단 하나만의 인스턴트를 생성하여 사용하지 위한 패턴
//		- 생성자를 여러 번 호출하더라도 인스턴스가 하나만 존재하도록 보장하여 애플리케이션에서 동일한 객체 인스턴스에 접근할 수 있도록 함

		// why?
		// 커넥션 풀, 스레드 풀, 디바이스 설정 객체 등과 같은 경우 인스턴스를 여러 개 만들게 되면 불필요한 자원을 사용하게 되고,
		// 프로그램이 예상치 못한 결과를 낳을 수 있음
		// 따라서 객체를 필요할 때마다 생성하는 것이 아닌 단 한번만 생성하여 전역에서 이를 공유하고 사용할 수 있게 하기 위해서
		// -> 유일한 인스턴스 (객체의 일관된 상태를 유지, 전역에서 접근 가능, 인스턴스가 겹쳐 발생하는 에러 방지)
		// -> 메모리 절약 (생성자를 여러번 호출 하더라도 새로운 인스턴스를 생성하지 않아 메모리 점유 및 해제에 대한 오버헤드를 줄임)
		// -> 지연 초기화 (인스턴스가 실제로 사용되는 시점에 생성하여 초기 비용을 줄일 수 있음)
		
		// 싱글톤 패턴의 기본 구현
		// - new 키워드를 사용할 수 없도록 생성자에 private를 지정
		// - 유일한 단일 객체를 반환할 수 있는 정적 메서드가 필요
		// - 유일한 단일 객체를 참조할 정적 참조 변수가 필요
		
		
		
		// 애플리케이션
		// - 스마트폰, 태블릿, PC 같은 기기등에서 설치하여 사용하는 응용 소픝웨어
		//   넓은 의미로는 모든 기기에 사용되는 응용 소프트웨어를 뜻함
		
		// 커넥션 풀
		// JDBC API를 사용하여 DB와 연결하기 위해 Connection 객체를 생성하는 작업
		
		// 스레드 풀
		// 미리 일정 개수의 쓰레드를 생성하여 관리하는 기법
		// 배열처럼 미리 공간을 준비해 놓고 사용할 시 활성화 미사용시 대기상태로 전환
		
		
	}

}
