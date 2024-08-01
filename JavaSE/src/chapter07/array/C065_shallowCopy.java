package chapter07.array;

public class C065_shallowCopy {

	public static void main(String[] args) {
		// 얕은 복사
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		Book[] bookArray3 = bookArray1;
		
		bookArray1[0] = new Book("태백산맥", "조정례");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		System.out.println("주소값1 : " + bookArray1);
		System.out.println("주소값2 : " + bookArray2);
		System.out.println("주소값3 : " + bookArray3);
		
		for (Book book : bookArray2) {
			book.showBookInfo();
		}
		
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("===== bookArray1 =====");
		for (int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();		// 내용출력
			System.out.println(bookArray1[i]);	// 제목 출력
		}
		
		System.out.println("===== bookArray2 =====");
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();		// 내용출력
			System.out.println(bookArray2[i]);	// 제목 출력
		}
		
		System.out.println("===== bookArray3 =====");
		for (int i = 0; i < bookArray3.length; i++) {
			bookArray3[i].showBookInfo();		// 내용출력
			System.out.println(bookArray3[i]);	// 제목 출력
		}
		
		// 얕은 복사를 했기때문에 bookArray1[0]의 값만 바꿨음에도 2,3의 값이 모두 같이 바뀐걸 알수 있다.
		// -> 1차 배열의 주소값과 2차 배열의 주소값은 다르다
		// -> 1차 배열의 딥카피를 하더라도 2차 배열이 얕은 복사일 경우 최종값은 얕은 복사인 상태

	}

}
