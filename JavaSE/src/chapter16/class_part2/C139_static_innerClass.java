package chapter16.class_part2;

class Human3 {
	int age;
	Name name;
	
	static class Name {
		String first;
		String family;
		
		Name(String first, String family) {
			this.first = first;
			this.family = family;
		}
	}
	Human3(int age, String first, String family){
		this.age = age;
		this.name = new Name(first, family);
	}
	void intro() {
		System.out.println("안녕, " + age + "살" + name.family + name.first + "이라고 해");
	}
}


public class C139_static_innerClass {

	public static void main(String[] args) {
		Human3 kim = new Human3(29, "상형", "김");
		kim.intro();
		
		Human3.Name name = new Human3.Name("순신", "이");
		System.out.println("이름 : " + name.family + name.first);

//		Human3.Name name2 = kim.new Name("길동","홍");
		
		
	}

}
