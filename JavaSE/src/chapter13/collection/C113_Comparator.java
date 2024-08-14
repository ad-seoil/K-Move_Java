package chapter13.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Person {
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person [name = " + name + "], [age = " + age + "]";
	}
	
}

// 비교기준
class PersonNameComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		return p1.name.compareTo(p2.name);
		// 역순정렬
		// -> 순서를 -1, 0, 1 ... 이런식으로 잡기때문에
//		return p1.name.compareTo(p2.name) * -1;	
	}
	
}

class PersonAgeComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		return Integer.compare(p1.age, p2.age);
	}
	
}


public class C113_Comparator {

	public static void main(String[] args) {
		// Comparator : 두 대매변수 객체를 비교

		List<Person> list = new ArrayList<>();
		list.add(new Person("홍길동", 30));
		list.add(new Person("강감찬", 80));
		list.add(new Person("이순신", 45));
		
		Collections.sort(list, new PersonNameComparator());
		
		for (Person p : list) {
			System.out.println(p);
		}
		
		System.out.println("========================================");
		Set<Person> set1 = new TreeSet<>(new PersonNameComparator());
		set1.add(new Person("홍길동", 30));
		set1.add(new Person("강감찬", 80));
		set1.add(new Person("이순신", 45));
		
		for (Person p : set1) {
			System.out.println(p);
		}
		
		System.out.println("========================================");
		Set<Person> set2 = new TreeSet<>(new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				// TODO Auto-generated method stub
				return p1.name.compareTo(p2.name) * -1;
			}
			
		});
		set2.add(new Person("홍길동", 30));
		set2.add(new Person("강감찬", 80));
		set2.add(new Person("이순신", 45));
		
		for (Person p : set2) {
			System.out.println(p);
		}
		
		
		
	}

}

