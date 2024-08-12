package chapter12.generic;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class C095_generic2 {

	public static void main(String[] args) {
		// 제네릭
		// - 데이터 타입의 다형성
		// - 참조형 데이터 타입만 가능
		// 제네릭 사용 이유
		// - 클래스 외부에서 타입을 지정해주기 때문에 따로 타입을 체크하고 변화해 줄 필요가 없음
		// - 컴파일 시점에 의도하지 않은 타입을 막을 수 있다 ( 타입안정성 )
		// - 코드의 재사용성이 높아진다
		// 제네릭 표기
		//  E - Element
		//  K - Key
		//  N - Number
		//  T - Type
		//  V - Value	...
		

		ArrayList arNum = new ArrayList();		
		arNum.add(1);
		arNum.add("문자열");
		
		// 여러 데이터의 타입을 받는게 장점인데 타입을 선언하지 않으면 object로 고정이 되어서
		// 여러 타입의 데이터는 받아지지만 출력은 마음대로 되지 않는다
		// 출력때 형변환을 하기 때문에
		int value = (int) arNum.get(0);
		// 문자열을 int형으로 형변환을 한다는 것은 말도 안되는 일이지만 컴파일 시점에서 확인하질 못함
//		int temp = (int)arNum.get(1);
//		System.out.println(temp);
		
		// 인스턴스 시점에서 타입을 지정해 주면서 컴파일 시점에서 에러가 확인 가능함
		ArrayList<Integer> arNum2 = new ArrayList<Integer>();
		arNum2.add(1);
//		arNum2.add("문자열");	//err
		
		
	}

}
