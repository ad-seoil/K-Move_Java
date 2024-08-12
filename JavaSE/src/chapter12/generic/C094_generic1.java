package chapter12.generic;

class Coffee {}
class Juice {}

class BeverageBox {
	private Object[] beverage;
	
	public BeverageBox(Object[] beverage) {
		this.beverage = beverage;
	}
	
	public Object getBeverage (int index) {
		return beverage[index];
	}
}

class BeverageBox2<T> {
	private T[] beverage;
	
	public BeverageBox2(T[] beverage) {
		this.beverage = beverage;
	}
	public T getBeverage (int index) {
		return beverage[index];
	}
}

public class C094_generic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coffee[] arr = {new Coffee(), new Coffee()};
		BeverageBox box = new BeverageBox(arr);
		
		Coffee coffee = (Coffee) box.getBeverage(0);
//		Juice juice = (Juice) box.getBeverage(1); // err
		
		Coffee[] arr2 = {new Coffee(), new Coffee()};
		BeverageBox2<Coffee> box2 = new BeverageBox2(arr2);
		Coffee coffee2 = box2.getBeverage(0);
		// 제네릭 타입은 클래스나 메서드를 정의할 때, 타입 파라미터로 객체의 타입을 지정해줌으로써 잘못된 타입이 사용될 ㅅ 있는
		// 문제를 컴파일 과정에서 체크하여 개발을 용이하게 한다
//		Juice juice2 = box2.getBeverage(1); // err
		
		

	}

}
