package chapter13.collection.ex;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class School_main {

	public static void main(String[] args) {
		// 학생관리 프로그램
		// 	- 클래스 생성
		//		school_main, school_method, student(학번, 이름, 전공)
		//	- 컬렉션 사용할 것
		// 1. 이름, 전공을 입력받아 학생 등록
		// 2. 이름을 입력받아 일치하는 학생정보를 출력
		// 3. 등록된 모든 학생정보를 전부 출력 ( 단, 학번순으로 정렬하여 출력할 것 )
		
		
		Scanner scan = new Scanner(System.in);
		School_method sm = new School_method();
//		Student student = null;
		Set<Student> studentList = new HashSet<>();
		int num = 0;
		
		// 종료를 입력받기 전까지 반복
		while (true) {
			// 안내문구 출력
			sm.printMenu();
			num = scan.nextInt();
			
			// 입력받은 숫자에 따른 기능 수행
			switch (num) {
				// 학생 등록
				case 1-> sm.enterStudent();
				// 학생 정보조회
				case 2 -> sm.selectStudent();
				// 전체 학생 정보조회
				case 3 -> sm.selectAll();
				// 종료
				case 0 -> System.exit(0);
			}
			
			
//			switch (num) {
//				// 학생 등록
//				case 1:
//					sm.enterStudent();
////					System.out.println("==================");
////					student = sm.registerStudent(); 
////					studentList.add(student);
//					
//					// 일련번호 1씩 상승
//					// 근데 Student 클래스에서 인스턴스 초기화 블럭에서 ++ 해줘서 필요가 없음
////					student.setSerialNum(student.getSerialNum()+1);
//					
////					System.out.println("성공적으로 등록했습니다");
//					break;
//				// 이름을 받아 일치하는 학생정보를 출력
//				case 2:
//					if (studentList.isEmpty()) {
//						System.out.println("학생 정보를 등록해주세요");
//					} else {
//						System.out.println("학생정보를 조회합니다");
//						sm.searchStudent(studentList);
////						System.out.print("> 조회할 이름 : ");
////						String searchName = scan.next();
////						
////						int cnt = 0;
////						// 특정한 값만 뽑아내는 법
////						for (Student s : studentList) {
////							if (s.getStdName().equals(searchName)) {
////								System.out.println("[학번 :" + s.getStdNo() 
////								+ " 이름 : " + s.getStdName() + ", 전공 : " + s.getMajor());
////								cnt++;
////							} else {
////								if (cnt == 0) {
////									System.out.println("일치하는 학생이 없습니다");
////								}
////								
////							}
////						}
//						
//					}
//					break;
//				// 컬렉션에 있는 모든 정보를 출력, 단 학번순으로 정렬
//				case 3:
//					if (studentList.isEmpty()) {
//						System.out.println("학생 정보를 등록해주세요");
//					} else {
//						System.out.println("전체 학생 정보를 조회합니다");
//						sm.searchStudentAll(studentList);
//						
//						
//						// 정렬 후 뽑아내야함
////						for (Student s : studentList) {
////							System.out.println("[학번 :" + s.getStdNo() 
////							+ "], 이름 : " + s.getStdName() + ", 전공 : " + s.getMajor());
////						}
//					}
//					
//					break;
//				// 종료
//				case 0:
//					System.out.println("프로그램을 종료합니다");
//					return;
//			default:
//				break;
//			}
			
		}
		
	}
	
}
