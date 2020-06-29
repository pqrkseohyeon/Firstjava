package utilTest;

import java.util.Collections;

public class EncTest {
	/*
	 * 암호화 전: Hi...Glad to meet you!!
	 * 암호화 후 : Jk00"Incf"vq"oggv"{qw##
	 * 공백은 +2 안하고 그대로 출력
	 * 암호화 후 : Jk00 Incf vq oggv {qw##
	 */

	public String encrypt(String msg) {//암호화 된 거에다 +2
		String dap = "";
		for(int i =0;i<msg.length();i++) {
	    if(msg.charAt(i)==' ') {//공백이면 //char는 문자이기 때문에 공백 표시 ' '로 한다. 문자열 공백 표시는" "
			dap += msg.charAt(i);
		}else {
			dap +=(char)(msg.charAt(i)+2);	
		}
		
		}	
	
		return dap;
	}
	
	public String decrypt(String str1) {//복호화 : 암호화 된 거에다 -2
		String dap = "";
		for(int i =0;i<str1.length();i++) {
	    if(str1.charAt(i)==' ') {
			dap += str1.charAt(i);
		}else {
			dap +=(char)(str1.charAt(i)-2);	
		}
		
		}	
	
		return dap;
	}


	public static void main(String[] args) {

		EncTest enc = new EncTest();
		String msg = "Hi... Glad to meet you!!";
		System.out.println("암호화 전 : " + msg);
		String str1 =  enc.encrypt(msg);//한문자에 2씩 더하기
		System.out.println("암호화 후 : " + str1);
		System.out.println("복호화 후 :" + enc.decrypt(str1));//암호화 된거에다 -2
		

		
		
		
	}

}
