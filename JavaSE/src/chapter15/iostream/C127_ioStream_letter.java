package chapter15.iostream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class C127_ioStream_letter {

	public static void main(String[] args) throws Exception {
		// 문자 단위 입출력
		String str = "자바 stream 입출력";
		FileWriter out = new FileWriter("test.txt");
		out.write(str);
		out.close();
		System.out.println("Write success");
		
		// 문자읽기
		FileReader in = new FileReader("test.txt");
		int ch;
		while (true) {
			ch = in.read();
			if (ch == -1) {
				break;
			}
			System.out.print((char)ch);
		}
		in.close();
		
		// 한번에 읽기
		System.out.println("\n===============");
		in = new FileReader("test.txt");
		char[] text = new char[20];
		// char 배열의 채워지지 않는 공간을 채울때 char i = '\u0000' 이라는 null의 유니코드를 집어넣음
		// null이라는건 int 나 char같은 범용적인 타입에 대입할 수 없지만...
		// primitive는 0이나 false 그리고 reference는 null
		int num = in.read(text);
		System.out.println("읽은 문자 개수 = " + num);
		System.out.println(text);
		in.close();

	}

}
