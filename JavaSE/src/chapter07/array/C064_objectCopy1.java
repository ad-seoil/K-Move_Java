package chapter07.array;

public class C064_objectCopy1 {

	public static void main(String[] args) {
		int a = 10;
		Book book  = new Book();
		book.showBookInfo();
		
		Book b = new Book();
//		b.bookName; 		// 접근지정자로 막혀있기 때문에 불러올 수 없음
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = bookArray1;
		
		bookArray1[0] = new Book("태백산맥", "조정례");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		// 주소값 동일 -> 같은 인스턴스를 가르킴
		System.out.println(bookArray1);
		System.out.println(bookArray2);
		
		// 주소값 동일 -> 같은 인스턴스를 가르킴
		System.out.println(bookArray1[0]);
		System.out.println(bookArray2[0]);
		

	}

}
