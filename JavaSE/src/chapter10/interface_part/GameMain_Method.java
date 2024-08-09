package chapter10.interface_part;

import java.util.Random;
import java.util.Scanner;

public class GameMain_Method {
	
	public void printMenu() {
		System.out.println("=== ABCDE_rpg ===");
		System.out.println("1. 캐릭터 생성");
		System.out.println("2. 캐릭터 정보");
		System.out.println("3. 전직하기");
		System.out.println("4. 기본 공격");
		System.out.println("5. 스킬 사용");
		System.out.println("0. 종료");
		System.out.println("==================");
		System.out.print("번호를 선택하세요 : ");
	}
	
	public Novice createCharacter() {
		// 캐릭터 생성
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		System.out.println("캐릭터를 생성합니다");
		System.out.println("사용하실 아이디를 입력해 주세요");
		String id = scan.next();
		int str = 0, dex = 0 , intel =0, sum = 0;
		String text ="";
		
		while (true) {
			System.out.println("스탯을 부여합니다");
			
			while (true) {
				str = r.nextInt(10);
				dex = r.nextInt(10);
				intel = r.nextInt(10);
				sum = str + dex + intel;
				if (sum >= 15) {
					break;
				}
			}
				System.out.printf("부여된 스탯 정보 : 힘[%d], 민첩[%d], 지능[%d] \n", str, dex, intel);
				System.out.print("스탯을 다시 받으시겠습니까? ( y / n ) : ");
				text = scan.next();
				
				if (text.equals("n")) {
					break;
				} 
			}
			Novice novice = new Novice(id, str, dex, intel);
			System.out.println("현재 정보로 저장합니다");
			return novice;
		}

	
	public void characterInfo(Novice novice) {
		String job = " ";
		if (novice instanceof Knight) {
			job = "기사";
		} else if (novice instanceof Thief) {
			job = "도적";
		} else if (novice instanceof Magician) {
			job = "마법사";
		} else {
			job = "평민";
		}
		
		String str = String.format("[ID : %s(%s), stat: 힘(%d), 민첩(%d), 지능(%d)", 
				novice.getName(),job,novice.getStrength() ,novice.getDexterity(), novice.getIntelligence());
		System.out.println(str);
	}
	
	// 출력 문구만 만드어놓은 메서드
	public void printText(int num) {
		switch (num) {
		case 1 -> System.out.println("게임을 종료합니다");
		case 2 -> System.out.println("번호를 잘못 입력헀습니다");
		case 3 -> System.out.println("캐릭터를 생성하세요");
		case 4 -> System.out.println("스킬을 배우지 않았습니다");
		}
	}
	
	// 전직 출력
	public int numberInput() {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		while(num > 3 || num < 1) {
			System.out.println("=== 직업 종류 ===");
			System.out.println("1. 기사");
			System.out.println("2. 도적");
			System.out.println("3. 마법사");
			System.out.print("전직할 직업의 번호를 선택하세요 : ");
			num = scan.nextInt();
		}
		return num;
	}

	public Novice jobSelect(int jobNum, Novice character) {
		Novice sc = null;
		switch (jobNum) {
		case 1:
			sc = new Knight(character.getName(), character.getStrength(), 
					character.getDexterity(), character.getIntelligence());
			System.out.println("기사로 전직합니다");
			break;
		case 2:
			sc = new Thief(character.getName(), character.getStrength(), 
					character.getDexterity(), character.getIntelligence());
			System.out.println("도적으로 전직합니다");
			break;
		case 3:
			sc = new Magician(character.getName(), character.getStrength(), 
					character.getDexterity(), character.getIntelligence());
			System.out.println("마법사로 전직합니다");
			break;
		}
		return sc;
	}

	public Skill skillInfo(Novice character) {
		Skill s = null;
		
		if (character instanceof Knight knight) {
			s = knight;
		} else if (character instanceof Thief thief){
			s = thief;
		} else if (character instanceof Magician magician){
			s = magician;
		}
		return s;
	}

}
