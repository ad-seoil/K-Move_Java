package chapter10.interface_part;

abstract class Car {
	// 추상메서드
	public abstract void drive();
	public abstract void stop();
	
	// 일반 메서드
	private void startCar() {
		System.out.println("시동을 켭니다");
	}
	private void turnOff() {
		System.out.println("시동을 끕니다");
	}
	
	// template 메서드
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}

class AICar extends Car {
	@Override
	public void drive() {
		System.out.println("차를 주행합니다");
		System.out.println("자동차가 알아서 방향을 전환합니다");
	}
	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다");
	}
}

class ManualCar extends Car {
	@Override
	public void drive() {
		System.out.println("사람이 운전합니다");
		System.out.println("사람이 핸들을 조작합니다");
	}
	@Override
	public void stop() {
		System.out.println("브레이크로 정지합니다");
	}
	
}


public class C078_templateMethod {

	public static void main(String[] args) {
		// 추상클래스를 이용한 템플릿 메서드 / 인스턴스 생성
		System.out.println("=== 자율 주행하는 자동차 ===");
		Car myCar = new AICar();
		myCar.run();
		
		System.out.println("=== 사람이 운전하는 자동차 ===");
		Car hisCar = new ManualCar();
		hisCar.run();
		
	}

}

abstract class A {
	abstract void methodA();
	abstract void methodB();
}

abstract class B extends A {
	@Override
	void methodA() {
		
	}
}

class C extends B {
	@Override
	void methodB() {
		
	}
}





