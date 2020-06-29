package day06_objectArray;

public class PlayerManager {
	private final int MAX_INT = 50;
	Player[] arr = new Player[MAX_INT];
	private int cnt;

	public void insertPlayer() {
		System.out.println("�������� ���...");
		System.out.print("�̸�>>");
		String name = BookMain.sc.nextLine();
		System.out.print("�ּ�>>");
		String address = BookMain.sc.nextLine();
		System.out.print("����>>");
		int age = BookMain.sc.nextInt();
		System.out.print("Ű>>");
		double height = BookMain.sc.nextDouble();
		System.out.print("������>>");
		double weight = BookMain.sc.nextDouble();
		arr[cnt++] = new Player(name,address,age,height,weight);
		
		

	}
	
	public void viewPlayer() {//�̸�, ���� ���
		for(Player p :arr) {
			if(p==null) break;
			System.out.println("�̸�:" + p.getName());
			System.out.println("����:" + p.getAge());
		}
		
		
	}
//	//����ã��
//	public void searchPlayer() {
//		System.out.println("ã�� ���� �̸�>>");
//		//�̸��� ������ ã�� ����
//		//ã�� ������ ������ �̸�, Ű, �ּ�,����,������ ���
//		//������ ã�� ������ �����ϴ�.
//		String searchName = BookMain.sc.next();
//		Player p = null;
//		for(int i = 0;i<cnt;i++) {
//		if(searchName.equals(arr[i].getName())) {
//			p = arr[i];
//			break;
//		 }//if
//		}//for
//		if(p!=null) {
//			//�̸�, ����, �ּ�, Ű, ������
//			System.out.println("�̸�:" + p.getName());
//			System.out.println("����:" + p.getAge());
//			System.out.println("�ּ�:" + p.getAddress());
//			System.out.println("Ű:" + p.getHeight());
//			System.out.println("������:" + p.getWeight());
//		}
//		
//		}else {
//			System.out.println("ã�� ���� �����ϴ�.");
//	}
		
	public void searchPlayer() {
		
	
		System.out.println("ã�� ���� �̸�>>");
		String searhName = BookMain.sc.next();
		Player p = search(searhName);
		if(p==null) {
			System.out.println("ã�� ���� �����ϴ�.");
			return;
		}
		System.out.println("�̸�:" + p.getName());
		System.out.println("����:" + p.getAge());
		System.out.println("�ּ�:" + p.getAddress());
		System.out.println("Ű:" + p.getHeight());
		System.out.println("������:" + p.getWeight());
		
 }
	public Player search(String searhName) {
		for(int i = 0;i<cnt;i++) {
		if(searhName.equals(arr[i].getName())) {
			return arr[i];
		}
		}
		return null;
	}

	
}
