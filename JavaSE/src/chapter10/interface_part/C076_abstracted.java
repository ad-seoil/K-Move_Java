package chapter10.interface_part;

abstract class Animal {
	// 멤버변수
	String name;
	
	Animal(String name){
		this.name = name;
	}
	
	// 멤버 메서드
	void alive() {
		System.out.println("생물");
	}

	// 추상메서드
	abstract void move();
}

class Human extends Animal {
	Human(String name){
		super(name);
	}

	@Override
	void move() {
		System.out.println("두 발로 간다");
	}
	
}

class Tiger extends Animal {
	Tiger(String name) {
		super(name);
	}
	
	@Override
	void move() {
		System.out.println("네 발로 뛰다");
	}

}

class Eagle extends Animal {
	Eagle(String name) {
		super(name);
	}

	@Override
	void move() {
		System.out.println("날다");
		
	}
	
}


class C076_abstracted {

	public static void main(String[] args) {
		// 추상클래스
		// 1. 하나 이상의 추상메서드를 가지고 있는 클래스는 abstract 키워드를 붙여서 사용한다
		// 2. 추상클래스는 객체를 생성할 수 없다
		// 3. 상속을 통해서만 가능하다. (추상클래스는 상속을하기 위해 만들어짐)
		// 4. 추상메서드가 있는 추상클래스를 상속받는 하위 클래스는 "반드시" 추상메서드를 Override 해야한다
		
//		Animal animal = new Animal();  //err
		Animal a = new Human("사람");
		Animal b = new Tiger("호랑이");
		Animal c = new Eagle("독수리");
		
		a.alive();
		a.move();
		b.move();
		c.move();
		
		
		
		
		
		
		
	}
	
	
}
