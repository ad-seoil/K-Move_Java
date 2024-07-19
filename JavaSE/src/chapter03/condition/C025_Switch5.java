package chapter03.condition;

public class C025_Switch5 {

	public static void main(String[] args) {
		// Switch 표현식
		// java14이상 추가
		int ranking = 1;
		String medal = switch (ranking) {
							case 1 ->	{
								System.out.println("우승 축하");
								yield "금메달";
							}
							case 2 -> "은메달";
							case 3 -> "동메달";
							default -> "참가상";
						};
		System.out.println(medal + "을 수여합니다");

	}

}
