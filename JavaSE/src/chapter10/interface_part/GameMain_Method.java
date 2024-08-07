package chapter10.interface_part;

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
	
	// 전직 출력 
	public void printJob() {
		System.out.println("=== 직업 종류 ===");
		System.out.println("1. 기사");
		System.out.println("2. 도적");
		System.out.println("3. 마법사");
		System.out.print("전직할 직업의 번호를 선택하세요 : ");
	}
	
}
