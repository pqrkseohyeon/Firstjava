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
					int i = fis.read();//�ַܼ� �о���� ���� ��ü �����, fis.read();
					if(i==-1)break;
					System.out.print((char)i);
					//fos.write(i);	// ������ ���� ��ü �����, fos.write();
				}
			} catch (FileNotFoundException e) {//try�ȿ����� ���� ������ ���� ������� �Ѵ�.
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}