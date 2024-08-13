package chapter12.generic;

class Human {
	void intro() {
		System.out.println("나 사람");
	}
}
class Student extends Human {
	void inro() {
		System.out.println("나 학생");
	}
}
class Room<T> {
	T value;
	Room(T value) {
		this.value = value;
	}
	T get() {
		return value;
	}
	void set(T value) {
		this.value = value;
	}
}


public class C101_generic_wildcards {
// <? extends 상위타입> : 상위 클래스 제한(상한선)
	static void printMan(Room<? extends Human> room) {
		room.get().intro();
	}
	
	static void printMan2(Room<? super Human> room) {
		Object obj = room.get();
		
		if (obj instanceof Human h) {
			h.intro();
		}else {
			System.out.println("Human 또는 그 하위타입 X");
		}
		
	}
	// <?> : 제합없음
	static void printMan3(Room<?> room) {
		Object obj = room.get();
		
		if (obj instanceof Human h) {
			h.intro();
		}else {
			System.out.println("Human 또는 그 하위타입 X");
		}
	}
	
	
	public static void main(String[] args) {
		Human h = new Human();
		Room<Human> bh = new Room<Human> (h);
		printMan(bh);
		printMan2(bh);
		printMan3(bh);
		
		Student s = new Student();
		Room<Student> bs = new Room<Student>(s);
		printMan(bs);
//		printMan2(bs);	// err
		printMan3(bs);
		
		
		
		

	}

}
