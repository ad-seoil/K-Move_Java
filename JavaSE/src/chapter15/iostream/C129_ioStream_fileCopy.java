package chapter15.iostream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class C129_ioStream_fileCopy {

	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();
		System.out.println("복사 시작");
		BufferedInputStream src = new BufferedInputStream(new FileInputStream("3시12분.txt"));
		BufferedOutputStream dest = new BufferedOutputStream(new FileOutputStream("3시12분-복사본.txt"));
		
		int data;
		while(true) {
			data = src.read();
			if (data == -1) {
				break;
			}
			dest.write(data);
		}
		System.out.println("복사완료");
		System.out.println((System.currentTimeMillis() - start) / 1000.0 + "초 걸림");
		
		
		System.out.println("===============================");
		long start2 = System.currentTimeMillis();
		System.out.println("복사 시작");
		
		try(FileInputStream src2 = new FileInputStream("3시12분.txt");
				FileOutputStream dest2 = new FileOutputStream("3시12분-복사본2.txt")) {
			int data2;
			while(true) {
				data2 = src2.read();
				if (data2 == -1) {
					break;
				}
				dest2.write(data2);
			}
			System.out.println("복사완료");
			System.out.println((System.currentTimeMillis() - start2) / 1000.0 + "초 걸림");
		}
		
	}

}
