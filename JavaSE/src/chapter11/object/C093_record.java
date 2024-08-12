package chapter11.object;

class Member2 {
	String name;
	int memberCode;
}

class A {}	// 상속불가
interface B {}	// 구현가능

record Member(String name, int memberCode) {
	// 생성자 생성
	public Member(String name, int memberCode) {
		this.name = name;
		this.memberCode = memberCode;
	}
	public Member(int memberCode) {
		this("홍길동", memberCode);
	}
}

public class C093_record {

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public static void main(String[] args) {
		// record
		// 불변(immutable) 객체를 쉽게 생성할 수 있도록 하는 유형의 클래스
		//	* 자동생성
		//		- 필드 캡슐화 (private, final)
		// 		- 생성자 메서드
		//		- getters 메서드
		//		- equals 메서드
		//		- hashcode 메서드
		//		- toString 메서드
		//	* 레코드의 제한
		//		- 다른 클래스를 상속 받을 수 없다
		//		- 인터페이스 구현은 가능하다
		//		- 레코드는 암묵적으로 final 클래스(상속불가)
		//		- abstract 선언불가
		
		
		Member member = new Member("홍길동", 123);
		System.out.println(member);
		System.out.println(member.name());
		System.out.println(member.memberCode());
		
		
		
		

	}

}
