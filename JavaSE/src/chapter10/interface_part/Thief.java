package chapter10.interface_part;

public class Thief extends Novice implements Skill {

	@Override
	public void skill() {
		System.out.println("도둑 스킬 발동");
		
	}

}
