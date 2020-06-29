package ioTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TokenFileTest {

	public static void main(String[] args) {

			try {
				
				FileInputStream fis = new FileInputStream("src\\ioTest\\input.txt");
				//FileOutputStream fos = new FileOutputStream("src\\ioTest\\out.txt";)
				
				while(true) {
					int i = fis.read();//콘솔로 읽어들일 때는 객체 만들고, fis.read();
					if(i==-1)break;
					System.out.print((char)i);
					//fos.write(i);	// 내보낼 때는 객체 만들고, fos.write();
				}
			} catch (FileNotFoundException e) {//try안에서는 작은 범위를 먼저 적어줘야 한다.
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}