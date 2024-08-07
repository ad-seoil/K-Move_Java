package chapter10.interface_part;

public class Magician extends Novice implements Skill{

	@Override
	public void skill() {
		System.out.println("마법 스킬 발동");
		
	}

}
