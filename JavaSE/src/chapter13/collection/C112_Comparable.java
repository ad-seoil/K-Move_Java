package chapter13.collection;

import java.util.Set;
import java.util.TreeSet;

class Member implements Comparable<Member>{
	String name;
	int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Member [name = " + name + "], [age = " + age + "]";
	}

	@Override
	public int compareTo(Member o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
	
}



public class C112_Comparable {

	public static void main(String[] args) {
		// Comparable : 자신과 매개변수 개체를 비교
		
		Set<Member> set = new TreeSet<>();
		set.add(new Member("홍길동", 20));
		set.add(new Member("강감찬", 50));
		set.add(new Member("이순신", 351));
		
		for (Member m : set) {
			System.out.println(m);
		}
		
		

	}

}
