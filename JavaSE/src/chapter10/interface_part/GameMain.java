package chapter10.interface_part;

import java.util.Random;
import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
//		// 프로그램이 실행되면 메뉴를 출력
//		1. 프로그램이 실행되면 메뉴를 출력한다.
//		2. 메뉴는 (1.캐릭터 생성, 2.캐릭터 정보, 3.전직하기, 4.공격하기, 0.종료)
//		   - (1.캐릭터 생성)을 선택한 경우, 이름과 스탯값을 초기값으로 하는 Novice(평민)클래스형 인스턴스를 생성한다.
//		     스탯은 (힘, 민첩, 지능)이 있으며 각각 랜덤한 값을 가지고, 
//		     형평성을 위해 스탯의 총 합이 15이상인 경우에만 저장되도록 하며,
//	     	 사용자의 선택에 따라 해당 스탯을 저장 or 스탯 재부여 할 수 있도록 한다.
//		3. - (2.캐릭터 정보)를 선택한 경우, 생성된 캐릭터의 이름, 직업, 힘, 민첩, 지능을 출력한다.
//		4. - (3.전직하기)를 선택한 경우, 생성된 캐릭터의 정보를 초기값으로 가지는 
//		     선택한 클래스에 해당하는 인스턴스를 생성하고 문구를 출력한다.
//		5. - (4.공격하기)를 선택한 경우, Attack()메서드를 호출하여 직업(인스턴스)에 따라 공격한다.
//		6. - (5.스킬사용)을 선택한 경우, Skill()메서드를 호출하여 직업(인스턴스)에 따라 스킬을 사용한다.
//		7. - (0.종료)를 선택한 경우, 프로그램을 종료한다.
//		8. - 종료를 선택하기 전까지 반복한다.

//		클래스 생성
//		GameMain  /  GameMain_Method  /  Novice  /  Knight  /  Magician  /  Thief  
//
//		인터페이스 생성
//			Skill
		
		
		// 메뉴
		Scanner scan = new Scanner(System.in);
		GameMain_Method gm = new GameMain_Method();
		Novice player = new Novice();
		int job = 0;
		
		while(true) {
			// 메뉴 출력 실행
			gm.printMenu();
			// 번호 선택
			int choose = scan.nextInt();
			switch (choose) {
			// 캐릭터 생성
			case 1:
				// 이름과 스탯값을 초기값으로 하는 Novice(평민)클래스형 인스턴스를 생성
				Novice create = new Novice();
				// 랜덤
				Random r = new Random();
				
				System.out.println("캐릭터를 생성합니다");
				System.out.print("사용하실 아이디를 입력해주세요 : ");
				// 아이디 저장
				create.setName(scan.next());
				System.out.println("스탯을 부여합니다");
				// 스탯 랜덤 부여
				while (true) {
					create.setDexterity(r.nextInt(9)+1);
					create.setIntelligence(r.nextInt(9)+1);
					create.setStrength(r.nextInt(9)+1);
					// 스탯이 15이상일때 저장할때 물어봄
					if (create.getDexterity() + create.getIntelligence() + create.getStrength() >= 15) {
						System.out.println("부여된 스탯정보 : " + "힘[" + create.getStrength() + "] , 민첩[" 
					+ create.getDexterity() + "], 지능[" + create.getIntelligence() + "]");
						System.out.print("스탯을 다시 받으시겠습니까? ( y / n ) : ");
						String save = scan.next();
						// 저장
						if (save.equals("n")) {
							player = create;
							System.out.println("[ID : " + player.getName() + ", stat : 힘(" 
							+ player.getStrength() + "), 민첩(" + player.getDexterity() + "), 지능(" + 
									player.getIntelligence() + " )]");
							System.out.println("현재 정보로 저장합니다");
							break;
						// 재부여
						} else {
							System.out.println("스탯을 재부여합니다");
						}
					}
				}
				break;
			// 캐릭터 정보 확인
			case 2:
				// 캐릭터가 있을때
				if (player.getName() == null) {
					System.out.println("캐릭터를 생성해주세요");
				} else {
					System.out.println("[ID : " + player.getName() + ", stat : 힘(" 
							+ player.getStrength() + "), 민첩(" + player.getDexterity() + "), 지능(" + 
									player.getIntelligence() + " )]");
				}
				
				break;
			// 전직하기
			case 3:
				gm.printJob();
				job = scan.nextInt();
				switch (job) {
				case 1:
					Knight kn = new Knight();
					System.out.println("기사로 전직합니다");
					break;
				case 2:
					System.out.println("도적으로 전직합니다");
					break;
				case 3:
					System.out.println("마법사로 전직합니다");
					break;
				}
				break;
			// 기본 공격
			case 4:
				
				break;
			// 스킬 사용
			case 5:

				break;
			// 시스템 종료
			case 0:
				System.out.println("종료합니다");
				System.exit(choose);
				break;
			default:
				break;
			}
		}
		
		
	}

}
