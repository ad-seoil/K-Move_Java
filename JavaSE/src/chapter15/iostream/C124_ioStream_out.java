package chapter15.iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C124_ioStream_out {

	public static void main(String[] args) {
		// 자바에서의 I/O (input, Output)  스트림음 데이터를 읽고 쓰는 방법을 제공하는 클래스
		// 스트림(Stream)은 데이터를 바이트 단위로 읽거나 쓰는 연속적인 데이터의 흐름
		// - InputStream / OutputStream : 바이트 단위 I/O 처리
		// - Reader 	 / Writer 		: 문자 단위 I/o 처리

		
		byte[] data = { 8, 9, 0, 6, 2, 9, 9 };
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("test.txt");
			out.write(data);
			System.out.println("Write success");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		
		}

}
}
