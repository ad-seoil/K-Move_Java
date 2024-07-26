package chapter06.class_part1;

class User	{
	String name;
	int age;
	
	void UserInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
	
	
	// 생성자(contstructor)
	// - 클래스를 통해 생성되는 인스턴스의 초기화를 도와주는 메서드의 일종
	// - 클래스 내에 선언되며, 클래스의 이름과 같으며, 리턴값이 없다
	// - 클래스를 데이터타입으로 해서 인스턴스(객체)를 생성하기 위해
	//	 호풀하는 객체 생성의 최소조건
	// - 생성자 오버로딩이 가능하므로 하나의 클래스에 여러 생성자 생성 가능
	
	
	// 기본생성자
	User(){
		
	}

	// 명시적 생성자
	User(String aName) {
		name = aName;
	}
	
	// 생성자 오버라이딩을 통한 생성자 추가
	User(String aName, int aAge){
		name = aName;
		age = aAge;
	}
	
	
}

class User2	{
	String name;
	int age;
	
	void UserInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
	
	public User2() {
		System.out.println("기본 생성자 호출");
	}
	
	public User2(String uName, int uAge) {
		System.out.println("명시적 생성자 호출");
		name = uName;
		age = uAge;
	}
	
}

public class C044_contstructor1 {

	public static void main(String[] args) {
		
		int a; // 실제로 값을 할당했을때 메모리를 할당받는다
//		System.out.println(a);
		
		
		// 인스턴스1
		User user1 = new User();
		user1.UserInfo();
		
		// 인스턴스2
		User user2 = new User("홍길동");
		user2.UserInfo();
		
		// 인스턴스3
		User user3 = new User("이순신", 55);
		user3.UserInfo();
		
		System.out.println("=====================");
		
		// 인스턴스4
		User2 user4 = new User2();
		user4.UserInfo();
		
		// 인스턴스5
		User2 user5 = new User2("홍길동", 11);
		user5.UserInfo();

	}

}
