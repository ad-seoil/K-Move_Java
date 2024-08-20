package chapter15.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	/**
	 *  객체 고유번호
	 *  serialVersionUID는 직렬화된 클래스의 버전을 나타내는 고유한 ID
	 *  역직렬화 시 버전 호환성을 확인하는데 사용, 클래스가 수정되면 UID값도 변경되어야 한다
	 */
	private static final long serialVersionUID = 6585249756640362609L;
	String name;
//	String job;
	transient String job; // 직렬화 대상 제외
	
	public Person() {}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	@Override
	public String toString() {
		return name + ", " + job ;
	}
	
}

public class C130_serialization {

	public static void main(String[] args) throws Exception, Exception {
		// 직렬화(serialization)
		// - 사용하고 있는 데이터를 파일 저장 혹은 데이터 통신에서
		//   파싱할 수 있는 유의미한 데이터를 만들기 위함
		
		// 데이터 직렬화 종류
		// - Java 직렬화
		// - Binary 직렬화
		// - CSV, XML, JSON ...

		// 직렬화(srialization) : 객체를 바이트 스트림으로 변환하는 과정
		// 역직렬화(Deserialization) : 바이트 스트림을 다시 객체로 복원하는 과정
		
		Person personAhn = new Person("안재용", "대표이사");
		Person personKim = new Person("김철수", "상무이사");
		
		// 직렬화
		try(FileOutputStream fos = new FileOutputStream("serial.out"); 
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(personAhn);
			oos.writeObject(personKim);
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		// 역직렬화
		try(FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Person p1 = (Person) ois.readObject();
			Person p2 = (Person) ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		} catch (IOException e) {
			// TODO: handle exception
		}
		
	}

}
