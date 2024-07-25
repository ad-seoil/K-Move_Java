package chapter05.method;

public class C037_method2 {

	public static void main(String[] args) {
		// 메서드 호출부분
		// - 호출하는 메서드가 파라미터가 있으면 데이터타입과, 개수, 순서에 맞춰서 보내주고 호출하는 메서드가 실행결과를 반환하는 메서드라면
		//	 해당 데이터타입의 값을 발다온다
		
		method01();
		String result = method02();
		System.out.println(result);
		method03(606);
//		int a = method03(606);
		int sum = method04(321, 606);
		System.out.println(sum);
		
		
	}
	
	
	// 메서드 정의부분
	// - [] 는 있어도 되고 없어도 되는 부분
	// - 접근지정자 (  ) 리턴타입 메서드명 ([데이터타입  변수명1], [데이터타입 변수명2], ..){
	//	메서드가 실행할 명령어
	//	return [ 값 ];
	// }  
	
	
	
	// 1. 데이터를 받지도 반환하지도 않는 메서드 
	// 파라미터 x, 반환값 x
	// void => 반환할 값이 없다는 의미로 리턴타입에 명시
	public static void method01() {
		// TODO Auto-generated method stub
		System.out.println("단순 명령어 실행, 아무겂도 받아오지 않았고 어떤 값도" + "반환하지 않는다");
		return ;	// 반환할 값이 없다면 적어도 되고 안적어도 됨
	}
	
	
	// 2. 데이터를 받아오지는 않지만 데이터를 반환하는 메서드
	// 파라미터 x, 반환값 o
	public static String method02() {
		System.out.println("문자열을 반환하는 메서드 실행");
		String result = "반환값";
		return result;
	}
	
	
	// 3. 데이터를 받아오지만 데이터를 반환하지는 않는 메서드
	// 파라미터 o, 반환값 x
	public static void method03(int a) {
		System.out.println("받아온 파라미터의 값은 : " + a + "이지만 반환할 값은 없다");
	}
	
	
	// 4. 데이터를 받아오기도 데이터를 반환하기도 하는 메서드
	// 파라미터 o, 반환값 o
	public static int method04(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	
	
	
	
	
	
	

}
