package chapter10.interface_part;

abstract sealed class Language permits Java, Cpp, CSharp {}
final class Java extends Language {}
//final class Cpp extends Language {}
//final class CSharp extends Language {}
//final class Python extends Language {}	// 상속제한

//final class OpenJava extends Java{}	// 상속제한
sealed class Cpp extends Language permits C11, C20 {}
non-sealed class CSharp extends Language {}

// Cpp로부터는 두개의 클래스만 파생 가능
final class C11 extends Cpp {}
final class C20 extends Cpp {}

// CSharp로 부터는 임의의 클래스파생 가능
final class CSharpCore extends CSharp {}



public class C077_abstract_sealed {

	public static void main(String[] args) {
		// 상속 제한
		// final : 더 이상 파생 불가
		// sealed : 지정한 후손에 대해서만 파생 허가
		// non-sealed : 제한없이 파생 가능

		Language lang_java = new Java();
		outLanguageName(lang_java);
		
	}

	public static void outLanguageName(Language lang) {
		if (lang instanceof Java) {
			System.out.println("자바");
		} else if (lang instanceof Cpp) {
			System.out.println("C++");
		}else if (lang instanceof CSharp) {
			System.out.println("C#");
		}
	}
	
	
	
}
