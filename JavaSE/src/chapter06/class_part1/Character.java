package chapter06.class_part1;

public class Character {
	// 캐릭터 정보
	private String id;
	private String job;
	private int level;
	private int str;
	private int dex;
	private int indel;

	// 초기화 블럭 (인스턴스 생성시 해당 변수 초기화)
	{
		this.level = 1;
		this.str = 1;
		this.dex = 1;
		this.indel = 1;
	}
	
//	public Character() {
//		this.level = 1;
//		this.str = 1;
//		this.dex = 1;
//		this.indel = 1;
//	}

	// 명시적 생성자 (주요 정보)
	public Character(String id, String job) {
		this.id = id;
		this.job = job;
//		this.level = 1;
//		this.str = 1;
//		this.dex = 1;
//		this.indel = 1;
	}

	// 명시적 생성자 (전체 정보)
	public Character(String id, String job, int level, int str, int dex, int indel) {
		this.id = id;
		this.job = job;
		this.level = level;
		this.str = str;
		this.dex = dex;
		this.indel = indel;
	}
	
	// 스킬 출력 메서드
	public void skill() {
		try {
			if (this.job.equals("마법사")) {
				System.out.println("파이어볼");
			}else if (this.job.equals("전사")) {
				System.out.println("배쉬");
			}else if (this.job.equals("궁수")) {
				System.out.println("크리티컬");
			}else {
				System.out.println("기본공격");
			}
		} catch (NullPointerException e) {
//			System.out.println(e.getMessage());
			System.out.println("기본공격");
		}
	}
	
	// 정보출력 메서드
//	public void Info() {
//		System.out.println("[" + id + "(" + job + ") " + "Lv" + level + "]님의 스탯 : "
//				+ "str(" + str + "), dex(" + dex + ") , indel(" + indel + ")" );
//	}
	
	@Override
	public String toString() {
		return "[" + id + "(" + job + ") " + "Lv" + level + "]님의 스탯 : "
				+ "str(" + str + "), dex(" + dex + ") , indel(" + indel + ")" ;
	}
	
	
	
	
	
	
	
	
}
