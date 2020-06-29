package cooperation;

public class Taxi {
	private String companyName;
	private int money;//수입
	
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
		System.out.println("택시" + companyName);
		System.out.println("택시수입" + money);
	}

}
