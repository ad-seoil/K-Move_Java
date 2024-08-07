package chapter10.interface_part;

// 기사
public class Knight extends Novice implements Skill {

	public String job;

	public Knight() {
		super();
		job = "기사";
	}
	
	@Override
	public void attack() {
		System.out.println("강력한 배쉬 공격");
	}

	@Override
	public void skill() {
		System.out.println("기사 스킬 발동");
		
	}

}
