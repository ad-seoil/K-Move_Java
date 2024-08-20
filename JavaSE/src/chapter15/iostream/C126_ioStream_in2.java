package chapter15.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C126_ioStream_in2 {

	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("test.txt");
		
		int data;
		for( ; ; ) {
			data = in.read();
			// -1 은 파일 읽기 스트림에서 파일의 끝을 나타내는 표준 값
			if (data == -1) {
				break;
			}
			System.out.print(data);
		}
		in.close();

	}

}
