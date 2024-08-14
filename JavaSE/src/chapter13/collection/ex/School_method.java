package chapter13.collection.ex;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class School_method {
	Scanner scan = new Scanner(System.in);
	TreeSet<Student> ts = new TreeSet<>();
	
	
	// 메뉴 출력
	public void printMenu() {
		System.out.println("=== 학사관리 프로그램 ===");
		System.out.println(" 1. 학생정보 등록");
		System.out.println(" 2. 학생정보 조회");
		System.out.println(" 3. 전체정보 조회");
		System.out.println(" 0. 종료");
		System.out.println("==================");
		System.out.print(" > 번호를 선택하세요 : ");
	}
	
	// 학생정보 등록
	public Student registerStudent() {
		
		System.out.println("학생정보를 등록합니다");
		System.out.print("> 이름 : ");
		String name = scan.next();
		System.out.print("> 전공 : ");
		String major = scan.next();
		// 만들어진걸 바로 컬렉션에 집어넣는게 나으려나
		Student student = new Student(name, major);
		
		return student;
	}
	
	public void enterStudent() {
		System.out.println();
		System.out.println("---------------------");
		System.out.println("학생정보를 등록합니다");
		System.out.print(" > 이름 : ");
		String name = scan.next();
		System.out.print(" > 전공 : ");
		String major = scan.next();
		
		Student st = new Student(name, major);
		boolean result = ts.contains(st);
		
		if (result) {
			System.out.println("[취소] 등록된 학생입니다");
		} else {
			ts.add(st);
			System.out.println("[성공] 등록되었습니다");
		}
	}
	
	
	// 입력된 이름과 같은 학생 정보 출력
	public void searchStudent(Set<Student> studentList) {
		System.out.println("학생정보를 조회합니다");
		System.out.print("> 조회할 이름 : ");
		String searchName = scan.next();
		
		// 특정한 값만 뽑아내는 법
		for (Student s : studentList) {
			if (s.getStdName().equals(searchName)) {
				System.out.println("[학번 :" + s.getStdNo() 
				+ " 이름 : " + s.getStdName() + ", 전공 : " + s.getMajor());
			}
		}
	}
	
	public void selectStudent() {
		System.out.println();
		System.out.println("---------------------");
		System.out.println("학생정보를 조회합니다");
		if (ts.isEmpty()) {
			System.out.println("학생정보가 없습니다");
			return;
		}
		System.out.print(" > 조회할 이름 : ");
		String searchName = scan.next();
		
		Iterator<Student> it = ts.iterator();
		while (it.hasNext()) {
			Student student = it.next();
			if (student.getStdName().equals(searchName)) {
				System.out.println(student);
				return;
			}
		}
		System.out.println("학생정보가 없습니다");
	}
	
	
	// 전체 학생 정보 뽑기
	public void searchStudentAll(Set<Student> studentList) {
		System.out.println("학생정보를 조회합니다");
		
		// 특정한 값만 뽑아내는 법
		for (Student s : studentList) {
			System.out.println("[학번 :" + s.getStdNo() 
			+ " 이름 : " + s.getStdName() + ", 전공 : " + s.getMajor());
		}
	}

	public void selectAll() {
		System.out.println();
		System.out.println("---------------------");
		System.out.println("전체 학생정보를 조회합니다");
		if (ts.isEmpty()) {
			System.out.println("학생정보가 없습니다");
			return;
		}
		
		Iterator<Student> it = ts.iterator();
		while (it.hasNext()) {
			Student st = it.next();
			System.out.println(st);
		}
		System.out.println();
	}
	
}
