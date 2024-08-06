package chapter08.inheritance;

class Human4 {
	Tool tool;
	
	Human4(String toolName){
		// 강한 결합
		// -> human4가 생긴 뒤에야 tool이라는 인스턴스가 만들어지기 때문에
		tool = new Tool(toolName);
	}
	
	void use() {
		System.out.println(tool.name + "을/를 사용하다");
	}
	
}

class Tool {
	String name;
	
	Tool(String name){
		this.name = name;
	}
	
}

class Car {
	private Engine engine;
//	private Engine engine = new Engine();
	
	// 약한 결합
	// -> 파라미터로 받아와서 초기화를 해주는 거기 때문에
	
	// 인스턴스를 생성하는 시점이 의존적이면 강한 결합
	// 아니라면 약한 결합
	public Car (Engine engine) {
		this.engine = engine;
	}
	
	public void assembleCae(Engine engine) {
		this.engine = engine;
	}
}

class Engine {
	
}


public class C073_has_a {

	public static void main(String[] args) {
		// has a relation
		// 포함, 구성 관계

		Human4 h = new Human4("파이어스틸");
		System.out.println(h.tool.name);
		h.use();
		
	}

}
