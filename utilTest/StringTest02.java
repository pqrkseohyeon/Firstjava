package utilTest;

public class StringTest02 {
	public static void main(String[]args) {
		String str = "�ȳ��ϼ���  Hello ������ �ڹ� ������!!!";
		System.out.println("str���� : " + str.length());// length() ������ str�� ���̸� �˷��ش� 
		System.out.println("H��ġ : " + str.indexOf('H'));//indexOf() ������ �Է��� ������ ��ġ�� �˷��ش�. 
		System.out.println("H��ġ : " + str.indexOf("Hello"));
		System.out.println("4��° ���� : " + str.charAt(4));//charAt()�� ������ ��ġ�� ���� ���ڰ� �ִ��� �˷��ش�.
		String tmp = "������ �սô�.";
		System.out.println("str �� tmp ���� : " + str+tmp);
		System.out.println("str �� tmp ���� : " + str.concat(tmp)); // concat()�� �ٸ� ���ڿ��� �������ִ� �Լ�
		
		int value = 7;
		System.out.println("str �� value ���� : " +str+value);
		
		//concat�̿�
		//System.out.println("str �� tmp ���� : " + str.concat(value));
		String s = String.valueOf(value); //concat�� int������ String�� Ŭ���������� �����ؾ��Ѵ�.  
		System.out.println("str �� value ���� : " +str.concat(s)); 
		System.out.println("tmp �� value ���� : " +tmp.concat(String.valueOf(value)));
		
		String msg = "abcdefg";
		System.out.println(msg.toUpperCase()); //toUpperCase() �빮�ڷ� �ٲ��ִ� �Լ�
		System.out.println(msg.toUpperCase().toLowerCase());//toLowerCase() �ҹ��ڷ� �ٲ��ִ� �Լ�
		//�迭�� �� ��ȣ�� ��ġ�� ���̳� �� �ƹ����� �ٿ��� ��
		String[] arr = str.split(" "); //split�� ��ȣ�ȿ� �����ڸ� ������ �װɷ� ����� ������ش�. ()�ȿ� ����ƴϾ ��
		for( int i =0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr.length);
		
		
	}

}
