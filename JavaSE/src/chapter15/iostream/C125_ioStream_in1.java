package chapter15.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C125_ioStream_in1 {

	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("test.txt");
		
		// available()은 현재 FileInputStream에서 읽을 수 있는
		// 바이트 수를 반환
		int avai1 = in.available();
		System.out.println(avai1);
		
		byte[] data = new byte[avai1];
		// read()는 파일에서 데이터를 읽어와 data 배열에 저장
		in.read(data);
		in.close();
		
		for (byte b : data) {
			System.out.print(b);
		}

	}

}
