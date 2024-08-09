package chapter11.object;

import java.util.Objects;

class Student {
	String name;
	int stdNum; // 학번
	
	Student(){
		
	}
	Student(String name, int stdNum){
		this.name = name;
		this.stdNum = stdNum;
	}
	
	@Override
	public int hashCode() {
		return this.stdNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		// Stduent 타입으로 표현이 안되니까 Student 클래스로 강제 형변환을 해서 다운시킴
		Student other = (Student) obj;
		return stdNum == other.stdNum;
	}
	
}


public class C083_hashcode {

	public static void main(String[] args) {
		Student st1 = new Student("홍길동", 20241001);
		Student st2 = new Student("홍길동", 20241001);
		Student st3 = st1;
		Student st4 = new Student("홍길동", 20241003);
		
		System.out.println("=== 주소 ===");
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println(st1 == st4);
		
		System.out.println("=== equals ===");
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st1.equals(st4));
		
		System.out.println("=== hashcode ===");
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		System.out.println(st4.hashCode());
		
		System.out.println("=== toString() ===");
		System.out.println(st1.toString());
		System.out.println(st2.toString());
		System.out.println(st3.toString());
		System.out.println(st4.toString());
		
		
	}

}
