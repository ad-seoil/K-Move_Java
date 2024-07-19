package chapter03.condition;

public class C023_Switch3 {

	public static void main(String[] args) {
		String country = "China";
		
		switch (country) {
			case "Korea":
				System.out.println("Seoul");
				break;
			case "China":
				System.out.println("Beijing");
				break;
			case "Japan":
				System.out.println("Tokyo");
				break;
		}
		
		// String 비교 ( ==, equals()	)
		// 기본 타입은 stack영역에 저장되는 반면
		// String 타입은 heap영역에 주소값으로 저장되기때문에
		
		// 문자열 상수풀로부터 같은 주소값을 가지고 있음
		String a = "안녕";
		String b = "안녕";
		System.out.println(a == b);
		
		// 다른 주소값을 가지고 있음
		String c = new String("안녕");
		System.out.println(a == c);
		
		// 주소값은 다르지만 내용물을 비교하기 위한 equals
		System.out.println(a.equals(c));
		

	}

}
