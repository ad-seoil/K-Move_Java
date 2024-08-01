package chapter07.array;

public class C_066_deepCopy {

	public static void main(String[] args) {
		// 깊은 복사
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		Book[] bookArray3 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		// arraycopy없이 deepCopy를 하려면 
		// 1차 배열을 새로운 인스턴스로 만들고 초기화
		// 2차 배열도 초기화를 시켜줘야함 (안하면 null상태로 NullPointerException 에러뜸)
		// 카피하려는 배열의 값까지 타고 들어가 직접적인 값을 카피 후 할당
		bookArray3[0] = new Book();
		bookArray3[0].setBookName(bookArray1[0].getBookName()); 
		bookArray3[0].setAuthor(bookArray1[0].getAuthor()); 
		bookArray3[1] = new Book();
		bookArray3[1].setBookName(bookArray1[1].getBookName()); 
		bookArray3[1].setAuthor(bookArray1[1].getAuthor()); 
		bookArray3[2] = new Book();
		bookArray3[2].setBookName(bookArray1[2].getBookName()); 
		bookArray3[2].setAuthor(bookArray1[2].getAuthor()); 
		
		for (int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		for (Book book : bookArray2) {
			book.showBookInfo();
		}
		
		for (Book book : bookArray3) {
			System.out.print(3);
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
		
		// 1차와 2차 배열이 모두 깊은 복사로 다른 인스턴스를 참조하고 있어
		// bookArray1의 값을 바꾼다고 해서 bookArray2의 값에서는 영향을 끼치지 않는다
		
	}

}
