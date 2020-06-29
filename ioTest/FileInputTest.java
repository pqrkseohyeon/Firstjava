package ioTest;
//FileInputStream은 파일을 읽어서 가져오는 것

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//FileOutputStream으로 저장한 내용을 읽어서 출력해라
//
public class FileInputTest {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("test.txt");
			while(true) {
				int i = fis.read();
				if(i==-1) break;
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		

}
