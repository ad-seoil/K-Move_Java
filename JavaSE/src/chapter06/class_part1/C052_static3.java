package chapter06.class_part1;

class Student {
	// Student 클래스를 참조하여 생성된 모든 인스턴스가 공유
	public static int serialNum = 1000;
	public int studentId;
	public String studentName;
	public int grade;
	public String address;
	
	public Student() {
		this.studentId = serialNum;
		serialNum++;
	}
	
	public void printInfo() {
		System.out.println("이름 : " + this.studentName);
		System.out.println("학번 : " + this.studentId);
	}
	
}

public class C052_static3 {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.studentName =  "이지원";
		studentLee.printInfo();
	
		Student studentSon = new Student();
		studentSon.studentName = "손흥민";
		studentSon.printInfo();
		
		
		
	}
	
	
}
