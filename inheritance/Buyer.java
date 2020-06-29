package inheritance;

import java.util.ArrayList;

public class Buyer {
	private int money;
	private int point;
	
	//Product[] arr = new Product[10];
	//int cnt;
	//Arraylist 생성
	ArrayList<Product> list = new ArrayList<Product>();
	public  Buyer(int money) {
		this.money = money;
	}
	
	
	//구매하기
	public void buy(Product p) {
		
		//arr[cnt++] = p; //tv com
		list.add(p);
		money-=p.price;
		point += p.bonusPoint;
		
	}
	
	//구매내역
	public void showInfo() {
		for(int i=0; i<list.size(); i++) {
			//System.out.println(arr[i]);
			System.out.println(list.get(i));
			//System.out.println(((Product)list.get(i)).price);
			System.out.println(list.get(i).price);
		}
		
		System.out.println("잔액 : " + money);
		System.out.println("포인트 : " + point);
		
		
	}
	

	
	

}
