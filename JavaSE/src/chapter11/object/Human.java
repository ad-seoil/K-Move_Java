package chapter11.object;

public class Human {
	int age;
	String name;
	
	int[] score =new int[] {1, 2, 3};
	
	Human(int age, String name){
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return age + "세의 " + this.name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Human h) {
			return (this.age == h.age && this.name == h.name); 
		}else {
			return false;
		}
	}
	
	
}
