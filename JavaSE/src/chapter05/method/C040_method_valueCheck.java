package chapter05.method;

public class C040_method_valueCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2;
		getDouble(num); // 기본 데이터는 값을 받아주는 변수를 선언하지 않으면 값에 영향을 끼치지 않음                          ㅠ                
		int num2 = getDouble(num);
		System.out.println("num = " + num);
		System.out.println("num2 = " + num2);
		
		int[] arr = {2, 8, 6};
		getDouble(arr); // 참조형 데이터는 줄 때도 주소값을 주고 받을 때도 주소값을 받는다
						// 같은 주소값을 참조하고 있기 때문에 변수에 값을 받아주지 않아도 값에 영향을 끼침
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		
	}

	
	public static int getDouble(int value) {
		value *= 2;
		return value;
	}
	
	
	public static void getDouble(int[] value) {
		value[0] += 2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
