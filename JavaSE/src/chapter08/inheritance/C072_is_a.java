package chapter08.inheritance;

class Animal {
	String name;
	
	void move() {
		System.out.println("움직이다");
	}
}

class Human3 extends Animal{
	@Override
	void move() {
		System.out.println("걷다");
	}
}

public class C072_is_a {

	public static void main(String[] args) {
		// is a relation
		// 상속관계, 다중상속x
		
		Animal a = new Human3();	// 사람 is a 동물 O
//		Human3 b = new Animal();	// 동물 is a 사람 X
		
	}

}
