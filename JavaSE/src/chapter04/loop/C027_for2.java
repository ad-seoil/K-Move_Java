package chapter04.loop;

public class C027_for2 {

	public static void main(String[] args) {
		
		// 제어변수 활용
		for (int i = 0, j = 1; i < 5; i++, j+=2) {
			System.out.println("i = " + i + ", j = " + j);
		}
		
		// 전역변수
		int globalVariable = 10;
		
		if(true) {
			System.out.println("IF문 내 전역변수 출력 : " + globalVariable);
			
			// 지역변수
			int localVariable = 100;
			System.out.println("IF문 내 지역변수 출력 : " + localVariable);
			
			for (int i = 0; i < 5; i++) {
				int localVariable2 = 200;
			}
			
		}
		System.out.println("IF문 밖 전역변수 출력 : " + globalVariable);
//		System.out.println("IF문 밖 지역변수 출력 : " + localVariable);
		// localVariable 변수는 지역변수로 if문의 블록을 벗어나서 없어지기 때문에 
		// 블록이 실행될때 그 안에서 만들어졌기 때문에 블록이 끝난다면 실행되서 만들어진 변수는 사라지기 때문에
		// 참조라면 변수는 사라지지만 주소자체는 남아있음

	}

}
