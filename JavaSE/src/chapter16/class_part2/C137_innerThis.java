package chapter16.class_part2;

class Human2 {
	int age = 30;
	Name name = new Name();
	class Name {
		int age = 50;
		void intro() {
			System.out.println(age);
			System.out.println(this.age);
			System.out.println(Human2.this.age);
		}
	}
}


public class C137_innerThis {

	public static void main(String[] args) {
		Human2 park = new Human2();
		park.name.intro(); 

	}

}
