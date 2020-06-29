package threadTest;


public class SaramRunnable implements Runnable {
	
	private String name;
	
	public SaramRunnable(String name) {
		this.name= name;
	}

	public static void main(String[] args) {
		
		SaramRunnable sr1 = new SaramRunnable("ȫ�浿");
		SaramRunnable sr2 = new SaramRunnable("�̼���");
		SaramRunnable sr3 = new SaramRunnable("������");
		
		//Runnable�� ����� ���� Thread ��ü�� �����ؼ� Runnable ������ �ҷ��´�.
		Thread th1 = new Thread(sr1); 
		Thread th2 = new Thread(sr2);
		Thread th3 = new Thread(sr3);
		th1.start();
		th2.start();
		th3.start();
	}

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(name + " �� ���Ѵ�.");
			try {//1�� ���� �����  ��
				Thread.sleep(1000);//1000ms -> 1��				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}

}
