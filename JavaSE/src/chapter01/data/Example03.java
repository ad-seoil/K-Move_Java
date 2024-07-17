package chapter01.data;

public class Example03 {

	public static void main(String[] args) {
		// 변수의 교환
		// 출력 결과
		// (교환전)
		// x = 200, y = 100
		// (교환후)
		// x = 100, y = 200
		
		
		// 교환전 값 초기화
		int x = 200;
		int y = 100;
		
		// 교환전 값 출력
		System.out.println("교환 전 x의 값은 " + x);
		System.out.println("교환 전 y의 값은 " + y);
		
		// 임시로 값을 보관할 변수 선언 => 바꾸어지는 값을 다른 곳에 보관하지 않으면 값이 사라져버리기 때문에
		int temp;
		
		// y값을 임시 변수 temp에 저장
		temp  = y;
//		System.out.println(temp);
				
		// x값을 변수y에 저장
		y = x;
//		System.out.println(y);
		
		// 임시변수에 저장되어있던 y의 값을 변수x에 할당
		x = temp;
//		System.out.println(x);
		
		// 체크
		System.out.println("==============================");
		System.out.println("교환 후 x의 값은 " + x );
		System.out.println("교환 후 y의 값은 " + y );
		
		
		
		
		
		
		

	}

}
