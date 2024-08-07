package chapter10.interface_part;

class Handhone {
	void call() {
		System.out.println("전화를 걸다");
	}
	
	void receive() {
		System.out.println("전화를 받는다");
	}
}

interface Camera {
	void takePicture();
}

class HandPhoneCamera extends Handhone implements Camera {
	@Override
	public void takePicture() {
		System.out.println("사진을 찍는다");
	}
	
}

public class C080_multiInheritance extends Object {

	public static void main(String[] args) {
		HandPhoneCamera myPhone = new HandPhoneCamera();
		myPhone.call();
		myPhone.takePicture();
	}
	
}

// 다중 상속, 다중 구분
interface AA {}
interface BB {}
class CC {}
class DD extends C implements AA, BB {}
interface EE extends AA, BB {}






