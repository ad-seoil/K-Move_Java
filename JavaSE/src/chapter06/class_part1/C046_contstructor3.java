package chapter06.class_part1;

class Product {
	// 정적 변수, 클래스 변수
	static int count = 0;
	// 인스턴스 변수
	int serialNo;
	
	static String productName;
	int num = 1;	// 명시적 초기화
	
	// 클래스 변수 : 클래스가 처음 로딩될 때 단 한번 초기화
	// 인스턴스 변수 : 인스턴스가 생성될 때마다 각 인스턴트별로 초기화
	// 클래스 변수의 초기화 순서 :  기본값 -> 명시적 초기화 -> 클래스 초기화 블럭
	// 인스턴스 변수의 초기화 순서 : 기본값 -> 명시적 초기화 -> 인스턴스 초기화 블럭 -> 생성자
	
	
	
	// 클래스 초기화 블럭
	static {
		productName = "DSA_14";
		System.out.println("static : " + productName);
		System.out.println("클래스 초기화 블럭 실행");
	}
	
	// 인스턴스 초기화 블럭
	{
		count++;
		serialNo = count;
		System.out.println("인스턴스 초기화 블럭 실행");
	}
	
	Product() {
		num++;
		System.out.println("기본 생성자 실행");
	}
	
}


public class C046_contstructor3 {
	
	public static void main(String[] args) {
//		System.out.println(Product.count);
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1 제품 번호(serial no)는 " + p1.serialNo);
		System.out.println("p2 제품 번호(serial no)는 " + p2.serialNo);
		System.out.println("p3 제품 번호(serial no)는 " + p3.serialNo);
		System.out.println("생상된 제품의 수는 모두 " + Product.count + "개" );
		
		System.out.println("p1 num : " + p1.num);
		System.out.println("p2 num : " + p2.num);
		System.out.println("p3 num : " + p3.num);
		
		
		
	}
	
}
