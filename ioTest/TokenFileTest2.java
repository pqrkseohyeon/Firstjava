package ioTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TokenFileTest2 {

	public static void main(String[] args) {
		

		//�� ���� �о� ���� ���� ��ĳ�ʸ� �̿�
		Scanner sfis = null;//���������� �ʱⰪ�� �� �־���Ѵ�.
		PrintStream ps=null;
		try {
			//scanner�� ����ϸ� ���ϰ�θ� �ν� �� �ؼ�  new File�� ��� File �̶�°� �νĽ��� ��� �Ѵ�.
			sfis = new Scanner(new File("src\\ioTest\\input.txt"));
			ps = new PrintStream("src\\ioTest\\hex.txt");
			while(sfis.hasNext()) {
				String str = sfis.nextLine();//���� ���� �� ���
				//split ���ڿ��� ������ �żҵ��̰� ()�ȿ� �����ڰ� ���� �ױ����ڷ� �����ִ� ��
				String[] tmp = str.split(":");
				for(int i=0;i<tmp.length;i++) {
					//System.out.print(tmp[i]+"\t");//16������ ���
					int v =Integer.parseInt(tmp[i]);
					//16������ �����ڴ� �빮�ڷ� ���
					System.out.print((Integer.toHexString(v).toUpperCase()+"\t"));
					ps.print(Integer.toHexString(v).toUpperCase()+"\t");
				}
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			sfis.close();
			ps.close();
		}
		
	}

}