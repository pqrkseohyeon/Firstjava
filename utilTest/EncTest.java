package utilTest;

import java.util.Collections;

public class EncTest {
	/*
	 * ��ȣȭ ��: Hi...Glad to meet you!!
	 * ��ȣȭ �� : Jk00"Incf"vq"oggv"{qw##
	 * ������ +2 ���ϰ� �״�� ���
	 * ��ȣȭ �� : Jk00 Incf vq oggv {qw##
	 */

	public String encrypt(String msg) {//��ȣȭ �� �ſ��� +2
		String dap = "";
		for(int i =0;i<msg.length();i++) {
	    if(msg.charAt(i)==' ') {//�����̸� //char�� �����̱� ������ ���� ǥ�� ' '�� �Ѵ�. ���ڿ� ���� ǥ�ô�" "
			dap += msg.charAt(i);
		}else {
			dap +=(char)(msg.charAt(i)+2);	
		}
		
		}	
	
		return dap;
	}
	
	public String decrypt(String str1) {//��ȣȭ : ��ȣȭ �� �ſ��� -2
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
		System.out.println("��ȣȭ �� : " + msg);
		String str1 =  enc.encrypt(msg);//�ѹ��ڿ� 2�� ���ϱ�
		System.out.println("��ȣȭ �� : " + str1);
		System.out.println("��ȣȭ �� :" + enc.decrypt(str1));//��ȣȭ �Ȱſ��� -2
		

		
		
		
	}

}
