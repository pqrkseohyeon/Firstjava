package threadTest;

public class GuguThread  extends Thread{
	private int dan;
	
	public GuguThread(int dan) {
		this.dan=dan;
	}
	
	public void run() {//Thread�� ����� ���� Tread�� ��ӹ޾Ƽ�, run�̶�� �Լ��� ����ؼ�, start�� �ҷ��´�.
		for(int i =1;i<=9;i++) {
				System.out.println(dan+"*"+i+"="+dan*1);
			
		}
	}
	


	public static void main(String[] args) {
		GuguThread g1 = new GuguThread(5);
		g1.start();
		GuguThread g2 = new GuguThread(7);
		g2.start();
		GuguThread g3 = new GuguThread(3);
		g3.start();
		
	}



}
