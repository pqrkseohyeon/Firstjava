package day05_object;

public class Good {
	String name,code,maker;
	double discountRate;
	int price;
	
	public Good(String code, String name, String maker, int price) {
		
	this.name=name;
	this.code=code;
	this.maker=maker;
	this.price=price;
	}
	
	
	public int getSellingPrice() {//�Ǹűݾ� :������ - ���ΰ���
		return price-(int)(price*discountRate);
	}
	
	public void updateDiscountRate(double rate) {//������
		discountRate = rate;	
	}
	

	
	
	
}

	
