package chapter15.iostream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class C132_file_makedir {

	public static void main(String[] args) throws IOException {
		File folder = new File("C:\\eclipse_file_directory\\TestFolder");

		if (folder.mkdir()) {
			File file = new File("C:\\eclipse_file_directory\\TestFolder\\Myfile.txt");
			if (file.createNewFile()) {
				FileWriter out = new FileWriter(file);
				out.write("테스트 파일");
				out.close();
			}
		}
		
		
	}

}
