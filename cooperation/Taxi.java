package cooperation;

public class Taxi {
	private String companyName;
	private int money;//����
	
	public Taxi(String companyName) {
		this.companyName = companyName;
	}
	
	public void take(int money) {
		this.money += money; 
	
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -=10000;
	}
	
	public void showInfo() {
		System.out.println("�ý�" + companyName);
		System.out.println("�ýü���" + money);
	}

}
