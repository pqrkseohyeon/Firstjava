package threadTest;

public class GuguThread  extends Thread{
	private int dan;
	
	public GuguThread(int dan) {
		this.dan=dan;
	}
	
	public void run() {//Thread를 사용할 때는 Tread를 상속받아서, run이라는 함수를 사용해서, start로 불러온다.
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
