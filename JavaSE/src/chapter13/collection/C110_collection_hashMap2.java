package chapter13.collection;

import java.util.HashMap;

class Human {
	int age;
	String name;
	
	Human(int age, String name){
		this.age = age;
		this.name = name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.length() + age;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Human) {
			Human other = (Human) obj;
			return (age == other.age && name.equals(other.name));
		} else {
			return false;
		}
	}
	
}

public class C110_collection_hashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Human, Integer> donate = new HashMap<>();
		donate.put(new Human(42, "김기남"), 10000);
		donate.put(new Human(24, "박수빈"), 20000);
		donate.put(new Human(20, "박수현"), 5000);
		donate.put(new Human(11, "최상미"), 8000);
		
		Human park = new Human(20, "박수현");
		System.out.printf("%s씨의 기부금 = %d", park.name, donate.get(park));
		
		
	}

}
