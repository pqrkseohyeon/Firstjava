package day04;

public class Gugudan {
	int dan;//�������
	public Gugudan(int dan) {
		this.dan = dan;
		
	}
	
	
	
	public void viewData() {//������ ���
		System.out.println(dan+"�� ���");
		for(int i=1;i<10;i++) {
			System.out.println(dan + "*"+i+"="+dan*i);
		}
		
		
	}
	
	public Gugudan() {
		
	}
	
	public static void main(String[] args) {
		
		Gugudan g1 = new Gugudan(5);
		g1.viewData();//5��
		
		Gugudan g2 = new Gugudan(7);
		g2.viewData(); //7��
		
		
		
		
	}
	

}
