package chapter11.object;

public class C089_stringBuffer {

	public static void main(String[] args) {
		// String
		// 불변성을 갖는다 > Immutable
		// StringBuilder, StringBuffer
		// 가변성을 갖는다 > mutable
		
		String str = "strA";
		String str2 = new String("strA");
		StringBuilder sbd = new StringBuilder();
		sbd.append("sbdA");
		StringBuffer sbf = new StringBuffer();
		sbf.append("sbfA");
		
		System.out.println("=== 문자열 출력 ===");
		System.out.println(str);
		System.out.println(str2);
		System.out.println(sbd);
		System.out.println(sbf);
		
		System.out.println("=== hashcode 출력 ===");
		System.out.println("String 객체의 hashcode : " + str.hashCode());
		System.out.println("String2 객체의 hashcode : " + str2.hashCode());
		System.out.println("String, String2 객체의 주소 비교 : " + (str == str2));
		System.out.println("StringBuilder 객체의 hashcode : " + sbd.hashCode());
		System.out.println("StringBuffer 객체의 hashcode : " + sbf.hashCode());
		
		// 데이터 수정 후 비교
		str += "strB";
		sbd.append("sbdB");
		sbf.append("sbfB");
		System.out.println("=== 수정 후 ===");
		System.out.println(str);
		System.out.println(sbd);
		System.out.println(sbf);
		
		System.out.println("=== hashcode 출력 ===");
		System.out.println("String 객체의 hashcode : " + str.hashCode());
		System.out.println("StringBuilder 객체의 hashcode : " + sbd.hashCode());
		System.out.println("StringBuffer 객체의 hashcode : " + sbf.hashCode());
	
		// 반복문 횟수가 2자리수가 넘어가면 StringBuilder가 StringBuffer보다 빠르다
		// 반복문이 적을 경우 StringBuffer가 StringBuilder보다 따르다
		
		

	}

}
