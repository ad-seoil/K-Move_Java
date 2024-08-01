package chapter07.array;

public class C063_arrayCopy2 {

	public static void main(String[] args) {
		int[] array1 = new int[] {1,2,3,4,5};
		int newLength = 10;
		
		System.out.println("System 클래스의 arrayCopy()");
		int[] array2 = new int[newLength];
		
		// 파라미터 = 		 복사할 배열, 복사할 첫위치, 대상배열, 붙여넣을 첫위치, 복사할 요소 개수
		System.arraycopy(array1,       0,     array2,     0,      array1.length);
		
		for (int i : array2) {
			System.out.print(i + " ");
		}
		
		System.out.println("\nfor문을 이용한 복사");
		int[] array3 = new int[newLength];
		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i];
			System.out.print(array3[i] + " ");
		}
		
		

	}

}
