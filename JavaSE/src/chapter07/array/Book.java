package chapter07.array;

public class Book {
	// 멤버변수
	private String bookName;
	private String author;
	
	// 기본 생성자
	public Book() {
		
	}
	
	// 명시적 생성자
	// -> 변수를 초기화
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	// 메서드
	public void showBookInfo() {
		System.out.println(bookName + ", " + author);
	}
	
	// bookName의 접근제어자가 private으로 집적적인 접근이 불가하기 때문에 public 접근제어자인 getter / setter를 생성하여 접근
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	
	
}
