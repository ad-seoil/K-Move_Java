package chapter06.class_part1;

public class C051_static2 {

	// 정적 메서드
	public static int add(int x, int y) {
		return x + y;
	}
	// 인스턴스 메서드
	public int min(int x, int y) {
		return x - y;
	}
	
	public static void main(String[] args) {
		int result1 = C051_static2.add(1,5);
		System.out.println(result1);
		
		C051_static2 instance = new C051_static2();
		int result2 = instance.min(5, 3);
		System.out.println(result2);
		
//		C051_static2.min(5,2); // static 하지 않은 메서드기 때문에 인스턴스가 필요
//		instance.add(3, 5);    // static 한 메서드이기 때문에 인스턴스가 필요없지만 인스턴스 후 호출도 가능함
							   // 그러나 인스턴스를 한 큰 의미가 없음 (권장 x)
		
	}
	
	
	
}
