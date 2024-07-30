package chapter06.class_part1;

public class Class_Example01 {

	public static void main(String[] args) {
		Character ch1 = new Character(null, null);
		System.out.println(ch1);
//		ch1.Info();
		ch1.skill();
		
		Character ch2 = new Character("zㅣ존 마법사", "마법사");
//		ch2.Info();
		System.out.println(ch2);
		ch2.skill();
		
		Character ch3 = new Character("zㅣ존 전사", "전사", 10, 50, 100, 10);		
//		ch3.Info();
		System.out.println(ch3);
		ch3.skill();
		
		Character ch4 = new Character("zㅣ존 궁수", "궁수", 100, 1000, 50, 50);		
//		ch4.Info();
		System.out.println(ch4);
		ch4.skill();
		
		Character ch5 = new Character("zㅣ존", "모험가", 20, 50, 50, 50);		
		System.out.println(ch5);
//		ch5.Info();
		ch5.skill();
		
	}
	
}
