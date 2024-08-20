package chapter15.iostream;

import java.io.BufferedReader;
import java.io.FileReader;

public class C128_ioStream_bufferTest {

	public static void main(String[] args) throws Exception {
		// BufferedReader : FileReader를 감싸서 버퍼를통해 읽기 성능 강화
		// 내부적으로 버퍼(일반적 8kb)를 사용하며, 한번에 다수의 데이터를
		// 미리 읽어들인 후, 필요한 만큼의 데이터를 버퍼에서 가져온다
		BufferedReader in = new BufferedReader(new FileReader("test.txt"));
		
		char[] text = new char[20];
		int num = in.read(text);
		System.out.println("읽은 문자 개수 = " +  num);
		System.out.println(text);
	}
	
}
