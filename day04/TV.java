package day04;

public class TV {
	
	String  maker;
	int year, inch;

	public TV(String maker, int year, int inch  ) {
		this.maker = maker;
		this.year = year;
		this.inch=inch;
		
	}
	public void show() {
		System.out.println(maker+"���� ����" + year+"�� ��"+inch+"TV");
	}
	

	public static void main(String[] args) {
		
		TV tv = new TV("LG", 2020,60);
		tv.show(); //LG ���� ���� 2020���� 60��ġ TV
		
		TV mytv = new TV("�Ｚ",2019,55);
		mytv.show(); //�Ｚ���� ���� 2019���� 55��ġ TV

	}

}
