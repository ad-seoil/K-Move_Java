package chapter11.object;

public class C081_toString {

	public static void main(String[] args) {
		int i = 1234;
		System.out.println(i);
		
		Human kim = new Human(29, "김상형");
		System.out.println(kim.toString());
		
		String str = "범인: " + kim;
		System.out.println(str);
		
		
	}
}
