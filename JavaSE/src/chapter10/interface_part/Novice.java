package chapter10.interface_part;

import java.util.Random;

// 평민
public class Novice {
	private String name;
	private int strength;
	private int dexterity;
	private int intelligence;
	private String job = "Novice";
	
	public Novice() { }
	
	// 아이디 입력하면 스탯부여
	public Novice(String name) {
		this.name = name;
		generateStats();
	}

	public Novice(String name, int strength, int dexterity, int intelligence) {
		super();
		this.name = name;
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
	}
	
	// 기본 공격 메서드
	public void attack() {
		System.out.println("기본 공격");
	}

	// getter / setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return name;
	}
	public String setJob() {
		return name;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getDexterity() {
		return dexterity;
	}
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	@Override
	public String toString() {
		return String.format("[ID] : %s, stat : 힘(%d), 민첩(%d), 지능(%d)]", 
				name, strength, dexterity, intelligence);
	}
	
	

	// 랜덤 스탯 부여
	private void generateStats() {
        Random random = new Random();
        // 스탯 랜덤 부여
        do {
            strength = random.nextInt(9) + 1;
            dexterity = random.nextInt(9) + 1;
            intelligence = random.nextInt(9) + 1;
            // 스탯 합이 15가 아니면 무한 이상일때까지 반복
        } while (strength + dexterity + intelligence < 15);
        // 저장 유무
        System.out.println();
    }

	// 정보 출력
	public void displayInfo() {
        System.out.printf("이름: %s, 직업: %s, 힘: %d, 민첩: %d, 지능: %d%n",
        		name, job, strength, dexterity, intelligence);
    }
	
}
