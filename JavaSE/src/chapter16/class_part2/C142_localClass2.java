package chapter16.class_part2;

class Human6 {
	int age;
	String name;
	
	Human6(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		final String nameCaption = "이름";
		final String ageCaption = "나이";
		
		class Formatter {
			void outInfo() {
				System.out.println(nameCaption + " : " + name);
				System.out.println(ageCaption + " : " + age);
			}
		}
		Formatter format = new Formatter();
		format.outInfo();
	}
}


public class C142_localClass2 {

	public static void main(String[] args) {
		Human6 inui = new Human6(23, "이누이");
		inui.intro();

	}

}
