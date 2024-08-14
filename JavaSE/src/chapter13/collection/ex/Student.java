package chapter13.collection.ex;

public class Student implements Comparable<Student>{
	// 멤버 변수
	private static int serialNum = 20241000;	// 인스턴스 일련번호
	private int stdNo;							// 학번
	private String stdName;						// 이름
	private String major;						// 전공
	
	
	// 인스턴스 초기화 블럭
	{
		serialNum++;
	}
	
	
	// 명시적 생성자
	public Student(String stdName, String major) {
		this.stdNo = serialNum;
		this.stdName = stdName;
		this.major = major;
	}
	
	
	// Getter, Setter
	public int getStdNo() {
		return stdNo;
	}
	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[학번 : " + stdNo + "] 이름 : " + stdName + ", 전공 : " + major;
	}
	
	// 동일함의 기준을 만들어주는 equals(), hashcode()
	@Override
	public int hashCode() {
		return this.getStdNo();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Student other = (Student) obj;
		return stdNo == other.stdNo;
	}
	
	// 비교 기준 CompareTo()
	// 두 객체를 비교해서 음수, 0, 양수 중 하나를 반환
	// 반환값에 따라 두 객체의 상대적인 순서가 결정
	@Override
	public int compareTo(Student o) {
		return this.stdNo - o.stdNo;
	}
	
	
	
	
}
