package inheritance;

import java.util.ArrayList;

public class Buyer {
	private int money;
	private int point;
	
	//Product[] arr = new Product[10];
	//int cnt;
	//Arraylist ����
	ArrayList<Product> list = new ArrayList<Product>();
	public  Buyer(int money) {
		this.money = money;
	}
	
	
	//�����ϱ�
	public void buy(Product p) {
		
		//arr[cnt++] = p; //tv com
		list.add(p);
		money-=p.price;
		point += p.bonusPoint;
		
	}
	
	//���ų���
	public void showInfo() {
		for(int i=0; i<list.size(); i++) {
			//System.out.println(arr[i]);
			System.out.println(list.get(i));
			//System.out.println(((Product)list.get(i)).price);
			System.out.println(list.get(i).price);
		}
		
		System.out.println("�ܾ� : " + money);
		System.out.println("����Ʈ : " + point);
		
		
	}
	

	
	

}
