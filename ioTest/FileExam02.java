package ioTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExam02 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src\\ioTest\\input.txt");
			//FileOutputStream fos = new FileOutputStream("input.txt")
		
			while(true) {
				int i = fis.read();
				if(i==-1) break;
				System.out.print(i);
				
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		
	}

}
