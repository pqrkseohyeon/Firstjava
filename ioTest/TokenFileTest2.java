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
		

		//한 줄을 읽어 들일 때는 스캐너를 이용
		Scanner sfis = null;//지역변수는 초기값이 꼭 있어야한다.
		PrintStream ps=null;
		try {
			//scanner를 사용하면 파일경로를 인식 못 해서  new File을 적어서 File 이라는걸 인식시켜 줘야 한다.
			sfis = new Scanner(new File("src\\ioTest\\input.txt"));
			ps = new PrintStream("src\\ioTest\\hex.txt");
			while(sfis.hasNext()) {
				String str = sfis.nextLine();//한줄 읽을 때 사용
				//split 문자열이 가지는 매소드이고 ()안에 구분자가 들어가서 그구분자로 나눠주는 것
				String[] tmp = str.split(":");
				for(int i=0;i<tmp.length;i++) {
					//System.out.print(tmp[i]+"\t");//16진수로 출력
					int v =Integer.parseInt(tmp[i]);
					//16진수로 영문자는 대문자로 출력
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