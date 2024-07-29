package chapter06.class_part1;

// 멤버변수의 경우 보통 private를 사용하여 외부로부터의 직접적인 접근을 막고,
// getter, setter 라 부르는 멤버메서드를 만들어 사용함으로써
// 내부 데이터에 제한적 접근을 할 수 있도록 한다

class Member {
	private String id;
	private String password;
	private String phoneNumber;
	
	// 멤버변수와 매개변수의 이름이 동일할 때,
	// 변수 이름이 같으므로 헷갈리지 않도록 this를 사용
	public Member(String id, String password, String phoneNumber) {
		this.id = id;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}
	
	// getter & setter
	
	// 회원 ID는 보통 변경이 안되므로 getter만 생성(읽기 전용)
	public String getId() {
		return id;
	}

	// 회원 pw는 변경만 가능하므로 setter만 생성
	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	public void memberInfo(String pwCheck) {
		if (this.password.equals(pwCheck)) {
			System.out.println("[ 회원 정보 ]");
			System.out.println(" *아이디 : " + this.id);
			System.out.println(" *전화번호 : " + this.phoneNumber);
		}
	}
}

public class C049_encapsulation {

	public static void main(String[] args) {
		Member member = new Member("홍길동", "123", "010-0321-0606");
//		member.id = "이순신"; // private이기 때문에 불가
//		System.out.println(member.id); // err
		String id = member.getId();
		System.out.println(id);
		member.memberInfo("123");
	}
	
	
}
