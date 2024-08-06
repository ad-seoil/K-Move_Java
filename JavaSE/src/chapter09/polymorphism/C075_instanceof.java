package chapter09.polymorphism;

class Dog extends Animal {
	void bark() {
		System.out.println("멍멍멍");
	}
}

class Dove extends Animal {
	void fly() {
		System.out.println("퍼득퍼득");
	}
}



public class C075_instanceof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog happy = new Dog();
		testAnimal(happy);
		
		Dove donald = new Dove();
		testAnimal(donald);

		System.out.println(happy instanceof Animal);
		System.out.println(happy instanceof Dog);
		System.out.println(donald instanceof Animal);
		System.out.println(donald instanceof Dove);
	}
	
	static void testAnimal(Animal animal) {
		animal.move();
//		animal.bark();
//		animal.fly();
		// 형변환
		if (animal instanceof Dog) {
			Dog mydog = (Dog) animal;
			mydog.bark();
		}
		if (animal instanceof Dove) {
			Dove mydove = (Dove) animal;
			mydove.fly();
		}
		
		// 패턴 매칭 (변수 instanceof 타입 캐스팅변수
		if (animal instanceof Dog mydog) {
			mydog.bark();
		}
		
		if (animal instanceof Dove mydove) {
			mydove.fly();
		}
		
		
	}

}
