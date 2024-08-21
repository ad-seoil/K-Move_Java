package chapter16.class_part2;

class AA {
	int i = 100;
	BB b = new BB();
	
	// BB클래스를 AA클래스 안에서만 사용하겠다는 목적이면 내부에 클래스를 정의하여 사용
	class BB {
		void method() {
			i += 100;
			AA a = new AA();
			System.out.println(a.i);
			// 이렇게 된다면 인스턴스를 사용하지 않고도 멤버변수에 대한 접근 권한이 생김
			System.out.println(i);
		}
	}
}


public class C134_innerClass {

	public static void main(String[] args) {
		AA a = new AA();
		System.out.println(a.i);
		a.b.method();
		
		// AA에 포함되어있기 때문에 BB만 따로 호출할 수 없다
		// BB b = new BB();

	}

}
