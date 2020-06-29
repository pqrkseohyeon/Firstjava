package threadTest;

class SharedBoard{
	private int sum=0;
	synchronized public void add() {//synchronized를 사용하면 내가 끝날 때 까지 기다려주고 내가 끝난다음에 다음 사람이들어온다.
		int n =sum;
		n += 10;
		sum = n;
		System.out.println(Thread.currentThread().getName() + ":" + sum);
	}
	
	public int getSum() {
		return sum;
	}
	
}
class StudentThread extends Thread{
	private SharedBoard board;
	public StudentThread(String name, SharedBoard board) {
		super(name);
		this.board=board;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			board.add();
		}
	}
}

public class SynchronizedEx {

	public static void main(String[] args) {
		SharedBoard board = new SharedBoard();
		Thread th1 = new StudentThread("이순신",board);
		Thread th2 = new StudentThread("홍길동", board);
		th1.start();
		th2.start();
		
	}

}
