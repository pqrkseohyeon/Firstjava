package interfaceTest;

import java.util.Scanner;

public abstract class Converter {
	abstract  double convert(double src);
	abstract String srcString();
	abstract String destString();
	protected double ratio;
	
	Scanner scanner = new Scanner(System.in);
	public void run() { //��ȯ
		System.out.println(srcString() + "��" + destString() + "�� �ٲߴϴ�.");
		System.out.println(srcString() + "�� �Է��ϼ���>>");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ��� : " +res +destString() + "�Դϴ�");
		
	}
}
